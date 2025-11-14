import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum Allergens { // synonym tokens per constant
    GLUTEN("gluten", "wheat"), // direct token passing
    NUTS("nut", "nuts", "tree nuts", "peanut", "peanuts", "almond", "walnut", "hazelnut", "pistachio", "cashew"),
    SOY("soy", "soy milk", "soybean", "soybeans"),
    FISH("fish", "salmon", "tuna", "cod"),
    DAIRY("dairy", "milk", "cheese", "yogurt", "butter", "cream"),
    EGG("egg", "eggs", "yolk", "egg white", "egg whites"),
    SESAME("sesame", "sesame oil", "sesame seeds");


    private static final Pattern PATTERN; // pattern shared by all constants

    static { // runs once when enum loads — light integration
        String alternation = Arrays.stream(values()) // stream over all enum constants
                .map(a -> "(?<" + a.name() + ">" + boundedAlternation(a.tokens) + ")") // creats a formatted named group per allergen set
                .collect(Collectors.joining("|")); // joined all groups with the alternation format
        PATTERN = Pattern.compile("(?iu)(?:" + alternation + ")"); // making case-insensitive

        // ^^ this regex is to formulate the enums and constants to this format: (?<GLUTEN>(?<!\p{L})(?:gluten|wheat)(?!\p{L}))


        // todo: cache common scans (e.g., description -> enumset) if this is called repeatedly
        // why: avoids recompiling/matching for identical strings across many orders
    }


    private final List<String> tokens; // immutable list of literal tokens for this allergen


    Allergens(String... tokens) { // constructor capturing varargs tokens
        this.tokens = List.of(tokens); // not an array list so its unmodifiable — constants cant be changed
        // todo: validate tokens not empty
        // why: prevents building empty groups which can cause unexpected matches
    }

    private static String boundedAlternation(List<String> toks) {

        String inner = toks.stream()
                .map(Pattern::quote) // quote each token (Constant) to not mistake as regex token
                .collect(Collectors.joining("|")); // joining constants/tokens with alternations present

        // create a safe return of constants with | for each enum group
        return "(?<!\\p{L})(?:" + inner + ")(?!\\p{L})"; // word edges — hyphens, punctuation and spaces are unbothered
        // negative lookbehind (<)       // negative lookahead
        // essentially matching if not touching other letters
        // this means it wouldnt match the "nut" in "donut"

        // shift + Cmd + '-'
        // cool shortcut
    }

    public static EnumSet<Allergens> scan(CharSequence text) { // to scan text and return enum token/text matches
        EnumSet<Allergens> found = EnumSet.noneOf(Allergens.class); // starts with an empty enum set

        if (text == null || text.isEmpty())
            return found;

        Matcher matcher = PATTERN.matcher(text); // matchr over the user inputted text

        while (matcher.find()) { // loops through all text to find Allergen match
            for (Allergens a : values()) { // check each named group's constants — i used method reference
                if (matcher.group(a.name()) != null) found.add(a); // if user text matches constant within enum group,
                // then add to found Allergens essentially
            }
            if (found.size() == values().length)
                break; // if # of elements found is the same as enum constants length
            // then stop — already found all allergens

        }
        return found; // returns detected allergens
    }

    public List<String> tokens() { // exposes my tokens

        return tokens; // returns my token list
    }


    public boolean in(CharSequence text) { // boolean to check whether specific allergen appears in user text
        if (text == null || text.isEmpty())
            return false;

        Matcher matcher = PATTERN.matcher(text); // created matcher with shared pattern

        while (matcher.find()) { // mapping the matches within the given token pattern within the text
            if (matcher.group(this.name()) != null)
                return true;
        }
        return false;
    }
}