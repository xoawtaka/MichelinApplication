import java.util.EnumSet;

public class AmericanCuisine extends Restaurant {

    public AmericanCuisine() {
        super("Foundry & Flame", RestaurantCuisine.AMERICAN, 7);

        // signatures (≥ 2)
        addToMenu(new MenuItem(
                "45-Day Dry-Aged Prime Ribeye",
                "Bone-in ribeye with marrow-fat butter and crispy leeks.",
                CourseCategories.SIGNATURES,
                62.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Wagyu Smashburger Duo",
                "American wagyu smash patties, smoked cheddar, brioche.",
                CourseCategories.SIGNATURES,
                30.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // chef spec (≥ 1)
        addToMenu(new MenuItem(
                "Chef’s Regional Heritage Tasting",
                "New American tasting menu exploring smoke, ferment, and fire.",
                CourseCategories.CHEF_SPEC,
                115.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // salads (≥ 2)
        addToMenu(new MenuItem(
                "Grilled Caesar with Parmesan Snow",
                "Charred romaine, anchovy emulsion, parmesan, sourdough crumbs.",
                CourseCategories.SALADS,
                17.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Heirloom Beet & Goat Cheese Mosaic",
                "Beet carpaccio, chèvre disks, pistachio dust.",
                CourseCategories.SALADS,
                18.00,
                EnumSet.of(Allergens.DAIRY, Allergens.NUTS)
        ));

        // appetizers (≥ 3)
        addToMenu(new MenuItem(
                "Smoked Bone Marrow",
                "Roasted marrow bones with herb gremolata and charred sourdough.",
                CourseCategories.APPETIZERS,
                18.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Bourbon-Glazed Pork Belly",
                "Slow-cooked pork belly with bourbon caramel and apple cider vinegar gel.",
                CourseCategories.APPETIZERS,
                17.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Buttermilk Fried Oysters",
                "Crispy oysters with lemon aioli.",
                CourseCategories.APPETIZERS,
                16.00,
                EnumSet.of(Allergens.DAIRY, Allergens.EGG)
        ));

        // mains (≥ 5)
        addToMenu(new MenuItem(
                "Blackened King Salmon",
                "Cajun-spiced salmon, charred corn, dill oil.",
                CourseCategories.MAIN_COURSE,
                29.00,
                EnumSet.of(Allergens.FISH)
        ));

        addToMenu(new MenuItem(
                "Buttermilk Fried Chicken Supreme",
                "Crispy fried chicken with hot honey and smoked mash.",
                CourseCategories.MAIN_COURSE,
                26.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Short Rib “Pot Roast 2.0”",
                "Sous-vide short rib, compressed carrots, jus gras.",
                CourseCategories.MAIN_COURSE,
                32.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Vegan Harvest Bowl",
                "Farro, roasted squash, charred kale, herb tahini.",
                CourseCategories.MAIN_COURSE,
                22.00,
                EnumSet.of(Allergens.SESAME)
        ));

        addToMenu(new MenuItem(
                "New England Lobster Roll (Warm Butter)",
                "Split-top roll, lobster claw and knuckle meat, browned butter.",
                CourseCategories.MAIN_COURSE,
                34.00,
                EnumSet.of(Allergens.GLUTEN, Allergens.DAIRY, Allergens.FISH)
        ));

        // desserts (≥ 3)
        addToMenu(new MenuItem(
                "Brown Butter Blondie with Gelato",
                "Warm blondie crumble with salted caramel gelato.",
                CourseCategories.DESSERT,
                11.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Midnight Chocolate Tart",
                "72% chocolate, rye crust, coffee dust.",
                CourseCategories.DESSERT,
                12.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Molasses Sticky Toffee Pudding",
                "Warm pudding cake with bourbon toffee sauce.",
                CourseCategories.DESSERT,
                10.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // drinks
        addToMenu(new MenuItem(
                "Sweet Tea Reduction (16 oz)",
                "Sweet tea slowly reduced for intensity, served over ice.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(3.50, FluidOz.OZ_16),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Cold Brew Concentrate (12 oz)",
                "Slow-steeped cold brew served over a large cube.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.50, FluidOz.OZ_12),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Smoked Cherry Cola (12 oz)",
                "House cola syrup with smoked cherries and soda.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.00, FluidOz.OZ_12),
                EnumSet.noneOf(Allergens.class)
        ));
    }
}