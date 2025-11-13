import java.util.EnumSet;

public class MediterraneanCuisine extends Restaurant {

    public MediterraneanCuisine() {
        super("Aegean Ember", RestaurantCuisine.MEDITERRANEAN, 7);

        // signatures (≥ 2)
        addToMenu(new MenuItem(
                "Charcoal-Grilled Octopus & Fava",
                "Santorini fava purée, smoked paprika oil, caper leaves.",
                CourseCategories.SIGNATURES,
                34.00,
                EnumSet.of(Allergens.FISH)
        ));

        addToMenu(new MenuItem(
                "Slow-Roasted Lamb Shoulder “Aegean Hearth”",
                "Wild herb-crusted lamb shoulder with lemon potatoes and charred onions.",
                CourseCategories.SIGNATURES,
                38.00,
                EnumSet.noneOf(Allergens.class)
        ));

        // chef spec (≥ 1)
        addToMenu(new MenuItem(
                "Chef’s Meze Odyssey",
                "Expansive meze tasting inspired by the ancient Aegean coast.",
                CourseCategories.CHEF_SPEC,
                98.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.NUTS, Allergens.SESAME)
        ));

        // salads (≥ 2)
        addToMenu(new MenuItem(
                "Elevated Greek Village Salad",
                "Heirloom tomatoes, barrel-aged feta, kalamata dust, oregano.",
                CourseCategories.SALADS,
                16.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Fennel Citrus Salad with Honey Vinegar",
                "Shaved fennel, citrus segments, mint, honey vinegar.",
                CourseCategories.SALADS,
                15.00,
                EnumSet.noneOf(Allergens.class)
        ));

        // appetizers (≥ 3)
        addToMenu(new MenuItem(
                "Halloumi with Fig Molasses",
                "Char-grilled halloumi with fig molasses and thyme.",
                CourseCategories.APPETIZERS,
                14.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Smoked Eggplant “Melitzanosalata”",
                "Burnt eggplant puree with pomegranate and herbs.",
                CourseCategories.APPETIZERS,
                13.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Stuffed Grape Leaves with Golden Raisins",
                "Vine leaves filled with herbed rice and golden raisins.",
                CourseCategories.APPETIZERS,
                12.00,
                EnumSet.noneOf(Allergens.class)
        ));

        // mains (≥ 5)
        addToMenu(new MenuItem(
                "Whole Grilled Branzino",
                "Charcoal-grilled branzino with lemon and oregano.",
                CourseCategories.MAIN_COURSE,
                30.00,
                EnumSet.of(Allergens.FISH)
        ));

        addToMenu(new MenuItem(
                "Lamb Gyro Plate",
                "Marinated lamb, warm pita, tzatziki, tomato, onion.",
                CourseCategories.MAIN_COURSE,
                24.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Spanakopita with Browned Butter Feta",
                "Crisp phyllo, spinach, browned butter feta.",
                CourseCategories.MAIN_COURSE,
                18.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Chicken Souvlaki",
                "Charred chicken skewers with herb rice and yogurt drizzle.",
                CourseCategories.MAIN_COURSE,
                22.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Vegetable Moussaka Modern",
                "Layered eggplant and vegetables with light béchamel foam.",
                CourseCategories.MAIN_COURSE,
                23.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        // desserts (≥ 3)
        addToMenu(new MenuItem(
                "Baklava Cigarillos",
                "Crisp phyllo cigars filled with pistachio and honey.",
                CourseCategories.DESSERT,
                10.00,
                EnumSet.of(Allergens.NUTS, Allergens.GLUTEN, Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Orange Blossom Semolina Cake",
                "Syrup-soaked semolina cake with orange blossom.",
                CourseCategories.DESSERT,
                9.00,
                EnumSet.of(Allergens.GLUTEN, Allergens.DAIRY, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Greek Yogurt Honeycomb Parfait",
                "Strained yogurt, honeycomb candy, walnut dust.",
                CourseCategories.DESSERT,
                9.00,
                EnumSet.of(Allergens.DAIRY, Allergens.NUTS)
        ));

        // drinks
        addToMenu(new MenuItem(
                "Mint Lemonade (16 oz)",
                "Fresh mint, lemon, and cane sugar over ice.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.50, FluidOz.OZ_16),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Turkish Coffee (8 oz)",
                "Strong, unfiltered coffee with cardamom.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(5.00, FluidOz.OZ_8),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Pomegranate Iced Tea (12 oz)",
                "Black tea with pomegranate syrup.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.00, FluidOz.OZ_12),
                EnumSet.noneOf(Allergens.class)
        ));
    }
}