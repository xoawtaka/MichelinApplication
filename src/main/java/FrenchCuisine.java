import java.util.EnumSet;

public class FrenchCuisine extends Restaurant {

    public FrenchCuisine() {
        super("Maison d’Étoile", RestaurantCuisine.FRENCH, 8);

        // signatures (≥ 2)
        addToMenu(new MenuItem(
                "Dry-Aged Duck à l’Orange",
                "Smoked and dry-aged duck breast with blood orange reduction and fennel pollen.",
                CourseCategories.SIGNATURES,
                44.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Seared Foie Gras with Sauternes Pear",
                "Butter-basted foie gras, candied pear, saffron gastrique.",
                CourseCategories.SIGNATURES,
                52.00,
                EnumSet.of(Allergens.DAIRY, Allergens.EGG)
        ));

        // chef spec (≥ 1)
        addToMenu(new MenuItem(
                "Chef’s Tasting: Winter in the Loire",
                "Seven-course tasting of truffle, game, and cellar-aged red wine reductions.",
                CourseCategories.CHEF_SPEC,
                120.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // salads (≥ 2)
        addToMenu(new MenuItem(
                "Frisée with Poached Quail Egg & Guanciale",
                "Bitter frisée, poached quail egg, crisp guanciale, warm shallot vinaigrette.",
                CourseCategories.SALADS,
                18.00,
                EnumSet.of(Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Endive, Blue Cheese & Champagne Grapes",
                "Raw endive petals, roquefort, toasted walnuts, champagne grape emulsion.",
                CourseCategories.SALADS,
                16.00,
                EnumSet.of(Allergens.DAIRY, Allergens.NUTS)
        ));

        // appetizers (≥ 3)
        addToMenu(new MenuItem(
                "Black Truffle Velouté",
                "Silky truffle broth with confit mushrooms and chive oil.",
                CourseCategories.APPETIZERS,
                19.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Escargots in Parsley-Garlic Butter",
                "Burgundy snails baked in herb butter.",
                CourseCategories.APPETIZERS,
                21.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Beef Tartare “Montmartre”",
                "Hand-cut beef tenderloin, Dijon, capers, cured egg yolk snow.",
                CourseCategories.APPETIZERS,
                23.00,
                EnumSet.of(Allergens.EGG)
        ));

        // mains (≥ 5)
        addToMenu(new MenuItem(
                "48-Hour Beef Bourguignon",
                "Short rib braised in Burgundy red wine with pearl onions and heirloom carrots.",
                CourseCategories.MAIN_COURSE,
                36.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Seared Turbot with Vermouth Cream",
                "Wild turbot, vermouth sabayon, caviar beurre blanc.",
                CourseCategories.MAIN_COURSE,
                48.00,
                EnumSet.of(Allergens.FISH, Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Coq au Vin “Grand Mère”",
                "Heritage chicken, smoked lardons, braised in red wine.",
                CourseCategories.MAIN_COURSE,
                34.00,
                EnumSet.of(Allergens.DAIRY)
        ));

        addToMenu(new MenuItem(
                "Ratatouille Provençal",
                "Compressed Provençal vegetables, confit tomato essence, basil oil.",
                CourseCategories.MAIN_COURSE,
                26.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Truffle Gnocchi Parisienne",
                "Pan-seared choux gnocchi in truffle cream.",
                CourseCategories.MAIN_COURSE,
                29.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        // desserts (≥ 3)
        addToMenu(new MenuItem(
                "Crème Brûlée with Tahitian Vanilla",
                "Silky vanilla custard beneath a glassy caramel crust.",
                CourseCategories.DESSERT,
                12.00,
                EnumSet.of(Allergens.DAIRY, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Tarte Tatin with Armagnac Cream",
                "Caramelized apples baked upside-down, served with Armagnac cream.",
                CourseCategories.DESSERT,
                13.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN, Allergens.EGG)
        ));

        addToMenu(new MenuItem(
                "Chocolate Delice with Sea Salt Praline",
                "70% dark chocolate mousse, praline crunch, fleur de sel.",
                CourseCategories.DESSERT,
                14.00,
                EnumSet.of(Allergens.DAIRY, Allergens.NUTS, Allergens.EGG)
        ));

        // drinks (any count, FluidOz-based)
        addToMenu(new MenuItem(
                "Elderflower Sparkling Water (12 oz)",
                "Chilled sparkling water softly perfumed with elderflower.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(4.00, FluidOz.OZ_12),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Lavender Honey Lemonade (16 oz)",
                "Pressed lemon, lavender, and wildflower honey.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(6.00, FluidOz.OZ_16),
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Café Crème (8 oz)",
                "French espresso with steamed cream.",
                CourseCategories.DRINKS,
                DrinkPricing.scaledPrice(5.00, FluidOz.OZ_8),
                EnumSet.of(Allergens.DAIRY)
        ));
    }
}