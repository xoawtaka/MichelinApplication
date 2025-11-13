import java.util.EnumSet;

public class JapaneseCuisine extends Restaurant {

    public JapaneseCuisine() {
        super("Hikari no Kawa", RestaurantCuisine.JAPANESE, 6);
        // Japanese cuisine = faster baseline prep

        addToMenu(new MenuItem(
                "Wagyu Don",
                "A5 wagyu over rice with soft egg and sweet soy glaze.",
                CourseCategories.MAIN_COURSE,
                42.00,
                EnumSet.of(Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Miso Soup",
                "Traditional fermented soybean broth with tofu and scallions.",
                CourseCategories.APPETIZERS,
                8.00,
                EnumSet.of(Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Tonkatsu",
                "Panko-breaded crispy pork cutlet with tonkatsu sauce.",
                CourseCategories.MAIN_COURSE,
                22.00,
                EnumSet.of(Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Matcha Cheesecake",
                "Creamy cheesecake infused with ceremonial matcha.",
                CourseCategories.DESSERT,
                10.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));
    }
}