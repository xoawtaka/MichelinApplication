import java.util.Arrays; // import arrays utility for streaming enum values
import java.util.EnumSet; // import enum set for efficient sets of enum constants
import java.util.List; // import list for storing tokens
import java.util.regex.Matcher; // import matcher for running regex searches
import java.util.regex.Pattern; // import pattern for compiling regex
import java.util.stream.Collectors; // import collectors for joining strings

public enum Allergens { // define allergens enum with synonym tokens per constant
    GLUTEN("gluten", "wheat"), // pass tokens directly instead of stringifying a list
    NUTS("nut", "nuts", "tree nuts", "peanut", "peanuts", "almond", "walnut", "hazelnut", "pistachio", "cashew"), // include common nut variants
    SOY("soy", "soy milk", "soybean", "soybeans"), // include soy phrase and forms
    FISH("fish", "salmon", "tuna", "cod"), // include representative fish
    DAIRY("dairy", "milk", "cheese", "yogurt", "butter", "cream"), // include dairy staples
    EGG("egg", "eggs", "yolk", "egg white", "egg whites"),
    SESAME("sesame", "sesame oil", "sesame seeds");

    private static final Pattern PATTERN; // precompiled one-pass pattern shared by all constants

    static { // static initializer builds the named-group alternation once
        String alternation = Arrays.stream(values()) // stream over all enum constants
                .map(a -> "(?<" + a.name() + ">" + boundedAlternation(a.tokens) + ")") // build a named group per allergen
                .collect(Collectors.joining("|")); // join all groups with alternation
        PATTERN = Pattern.compile("(?iu)(?:" + alternation + ")"); // compile case-insensitive unicode pattern
        // todo: cache common scans (e.g., description -> enumset) if this is called repeatedly
        // why: avoids recompiling/matching for identical strings across many orders
    }

    private final List<String> tokens; // immutable list of literal tokens for this allergen

    Allergens(String... tokens) { // constructor capturing varargs tokens
        this.tokens = List.of(tokens); // store as unmodifiable list
        // todo: validate tokens not empty
        // why: prevents building empty groups which can cause unexpected matches
    }

    private static String boundedAlternation(List<String> toks) { // build unicode-aware, boundary-guarded alternation
        String inner = toks.stream() // stream tokens
                .map(Pattern::quote) // quote each token to treat literally
                .collect(Collectors.joining("|")); // join tokens with alternation
        return "(?<!\\p{L})(?:" + inner + ")(?!\\p{L})"; // use letter boundaries so hyphens/spaces are edges (e.g., gluten-free)
    }

    public static EnumSet<Allergens> scan(CharSequence text) { // scan text and return all allergens mentioned
        EnumSet<Allergens> found = EnumSet.noneOf(Allergens.class); // start with an empty enum set
        if (text == null || text.isEmpty()) return found; // handle null or empty input
        Matcher matcher = PATTERN.matcher(text); // create a matcher over the text
        while (matcher.find()) { // iterate all matches
            for (Allergens a : values()) { // check each named group
                if (matcher.group(a.name()) != null) found.add(a); // if group captured, record the allergen
            }
            if (found.size() == values().length) break; // early exit if all allergens found
        }
        return found; // returns detected allergens
    }

    public List<String> tokens() { // expose tokens for inspection if needed
        return tokens; // return the token list
    }

    public boolean in(CharSequence text) { // check whether this specific allergen appears in text
        if (text == null || text.isEmpty()) return false; // guard against null or empty
        Matcher matcher = PATTERN.matcher(text); // create matcher with shared pattern
        while (matcher.find()) { // walk the matches
            if (matcher.group(this.name()) != null) return true; // return true if this allergen’s group captured
        }
        return false;
    }
}