import java.util.EnumSet;

public class FrenchCuisine extends Restaurant {

    public FrenchCuisine() {
        super("Maison d’Étoile", RestaurantCuisine.FRENCH, 8);
        // 8-minute base prep unit for French cuisine

        addToMenu(new MenuItem(
                "Coq au Vin",
                "Red wine–braised chicken with mushrooms, lardons, and pearl onions.",
                CourseCategories.MAIN_COURSE,
                32.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Bouillabaisse",
                "Marseille-style fish stew with saffron and fennel.",
                CourseCategories.MAIN_COURSE,
                36.00,
                EnumSet.of(Allergens.FISH)
        ));

        addToMenu(new MenuItem(
                "French Onion Soup",
                "Caramelized onions, rich broth, gratinéed gruyère.",
                CourseCategories.APPETIZERS,
                15.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Crème Brûlée",
                "Vanilla custard with a caramelized sugar crust.",
                CourseCategories.DESSERT,
                12.00,
                EnumSet.of(Allergens.DAIRY)
        ));
    }
}