import java.util.EnumSet;

public class JapaneseCuisine extends Restaurant {

    public JapaneseCuisine() {
        super("Hikari no Kawa", RestaurantCuisine.JAPANESE, 6);

        // signatures (≥ 2)
        addToMenu(new MenuItem(
                "A5 Miyazaki Wagyu Striploin",
                "Binchotan-charred A5 wagyu striploin with fresh wasabi and sansho salt.",
                CourseCategories.SIGNATURES,
                78.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Seasonal Omakase Sashimi Flight",
                "Kinmedai, chutoro, botan shrimp, and seasonal white fish.",
                CourseCategories.SIGNATURES,
                62.00,
                EnumSet.of(Allergens.FISH)
        ));

        // chef spec (≥ 1)
        addToMenu(new MenuItem(
                "Kaiseki Experience: Shun no Kisetsu",
                "Traditional multi-course kaiseki following the rhythm of the seasons.",
                CourseCategories.CHEF_SPEC,
                135.00,
                EnumSet.of(Allergens.FISH, Allergens.SOY, Allergens.EGG)
        ));

        // salads (≥ 2)
        addToMenu(new MenuItem(
                "Daikon & Shiso Salad with Yuzu Mist",
                "Shaved daikon, shiso, micro-greens, bright yuzu dressing.",
                CourseCategories.SALADS,
                13.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Goma-ae Spinach",
                "Blanched spinach dressed in roasted sesame sauce.",
                CourseCategories.SALADS,
                12.00,
                EnumSet.of(Allergens.SESAME)
        ));

        // appetizers (≥ 3)
        addToMenu(new MenuItem(
                "Miso Cappuccino",
                "Foamed white miso broth with tofu pearls.",
                CourseCategories.APPETIZERS,
                9.00,
                EnumSet.of(Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Agedashi Tofu with Dashi Gelée",
                "Crispy tofu in warm dashi, shaved bonito, ginger.",
                CourseCategories.APPETIZERS,
                12.00,
                EnumSet.of(Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Chicken Karaage “Kuro”",
                "Black garlic–marinated fried chicken with smoked soy and citrus salt.",
                CourseCategories.APPETIZERS,
                15.00,
                EnumSet.of(Allergens.SOY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // mains (≥ 5)
        addToMenu(new MenuItem(
                "Miso-Glazed Black Cod “Saikyo Yaki”",
                "48-hour Saikyo miso marinade, charred baby bok choy.",
                CourseCategories.MAIN_COURSE,
                34.00,
                EnumSet.of(Allergens.FISH, Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Iberico Tonkatsu",
                "Iberico pork loin, panko crust, house tonkatsu sauce.",
                CourseCategories.MAIN_COURSE,
                27.00,
                EnumSet.of(Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Chicken Katsu Curry",
                "Crisp chicken cutlet over rice with Japanese curry.",
                CourseCategories.MAIN_COURSE,
                25.00,
                EnumSet.of(Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Tempura Udon",
                "Thick udon noodles in dashi broth with shrimp tempura.",
                CourseCategories.MAIN_COURSE,
                24.00,
                EnumSet.of(Allergens.GLUTEN, Allergens.FISH, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Vegetable Donburi with Sansho Oil",
                "Charred seasonal vegetables over steamed rice with sansho chili oil.",
                CourseCategories.MAIN_COURSE,
                20.00,
                EnumSet.noneOf(Allergens.class)
        ));

        // desserts (≥ 3)
        addToMenu(new MenuItem(
                "Matcha Soufflé",
                "Oven-baked matcha soufflé with light cream.",
                CourseCategories.DESSERT,
                11.00,
                EnumSet.of(Allergens.DAIRY, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Black Sesame Parfait",
                "Layers of black sesame cream, brittle, and sponge.",
                CourseCategories.DESSERT,
                10.00,
                EnumSet.of(Allergens.DAIRY, Allergens.SESAME, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Yuzu Sorbet with Shiso Sugar",
                "Fragrant yuzu sorbet with candied shiso leaf.",
                CourseCategories.DESSERT,
                9.00,
                EnumSet.noneOf(Allergens.class)
        ));

        // drinks
        addToMenu(new MenuItem(
                "Hot Ceremonial Matcha (8 oz)",
                "Whisked ceremonial-grade matcha.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(5.50, FluidOz.OZ_8),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Iced Hojicha (12 oz)",
                "Roasted green tea over ice.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.50, FluidOz.OZ_12),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Yuzu Soda (16 oz)",
                "Sparkling drink with yuzu citrus.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(6.00, FluidOz.OZ_16),
                EnumSet.noneOf(Allergens.class)
        ));
    }
}