import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public enum Allergens {
    GLUTEN(String.valueOf(List.of("gluten", "wheat"))),
    NUTS(String.valueOf(List.of("nut", "nuts", "tree nuts", "peanut", "peanuts", "almond", "walnut", "hazelnut", "pistachio", "cashew"))),
    SOY(String.valueOf(List.of("soy", "soy milk", "soybean", "soybeans"))),
    FISH(String.valueOf(List.of("fish", "salmon", "tuna", "cod"))),
    DAIRY(String.valueOf(List.of("dairy", "milk", "cheese", "yogurt", "butter", "cream")));

    private List<String> tokens;

    // takes constructor as saves them as immutable tokens
    Allergens(String... tokens) {
        this.tokens = List.of(tokens);
    }

    // return the tokens if user ever need to inspect them
    public List<String> tokens() {
        return tokens;
    }

    // regex pattern shared by all enum values
    private static final Pattern PATTERN;

    // static initializer builds the big alternation var with named groups
    static {
        // building a named capture group for each allergen using its tokens
        String alternation = Arrays.stream(values())
                // foreach enum constant, i want to create a group like (?<GLUTEN>)
                .map(a -> "(?<" + a.name() + ">" + boundedAlternation(a.tokens) + ")")
                // pipe (|) as my delimiter so any allergen match will be found
                .collect(Collectors.joining("|"));

        PATTERN = Pattern.compile("(?i)(?: " + alternation + ")");
    }

    // helper method to builds guarded alternation of tokens
    private static String boundedAlternation(List<String> tokes) {
        String inner = tokes.stream()
                .map(Pattern::quote)
                .collect(Collectors.joining("|"));

        // hyphens and spaces count as edges like ex.: gluten-free
        return "(?<!\\p{L})(?:" + inner + ")(?!\\p{L})";
    }

    // scan arbitrary text
    // return all allergens
    public static EnumSet<Allergens> scan(CharSequence text) { //sequence of char values (using to catch match)

        EnumSet<Allergens> found = EnumSet.noneOf(Allergens.class);
        if (text == null || text.isEmpty()) return found;

        // run the matcher on txt
        Matcher matcher = PATTERN.matcher(text);
        while (matcher.find()) {
            // for each allergen, check if its named group captured something
            for (Allergens a : values()) {
                // if this allergens group is non-null in this match, record it
                if (matcher.group(a.name()) != null) found.add(a);
            }
            if (found.size() == values().length)
                break;
        }
        // return the set of customer allergens
        return found;
    }

    // convenience: check if this specific allergen appears in the text
    public boolean in(CharSequence text) {

        if (text == null || text.isEmpty()) return false;

        // create a matcher with pattern
        Matcher matcher = PATTERN.matcher(text);

        // check matcher finds
        while (matcher.find()) {
            if (matcher.group(this.name()) != null) return true;
        }
        return false;
    }
}

// make so that allergen excludes specific dishes
// OR make so that allergens are boolean that get marked on order
// ^ this would mean that something like 'Allergens: blah blah blah' would be listed on order,
// following 'this order will be made without (Allergen)'


   /* public Allergens hasAllergy(Scanner input, boolean hasAllergyGluten, boolean hasAllergyNuts, boolean hasAllergySoy,
                              boolean hasAllergyFish, boolean hasAllergyDairy) {
        switch (this) {
            case GLUTEN:
                hasAllergyGluten = true;
                System.out.println("No Gluten");
            case NUTS:
                hasAllergyNuts = true;
                System.out.println("No Nuts");
            case SOY:
                hasAllergySoy = true;
                System.out.println("No Soy");
            case FISH:
                hasAllergyFish = true;
                System.out.println("No Fish");
            case DAIRY:
                hasAllergyDairy = true;
                System.out.println("No Dairy");
        }
        
        return this;
    }*/


// gluten, nuts, soy, fish, dairy