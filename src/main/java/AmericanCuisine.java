import java.util.EnumSet;

public class AmericanCuisine extends Restaurant {

    public AmericanCuisine() {
        super("Foundry & Flame", RestaurantCuisine.AMERICAN, 7);

        addToMenu(new MenuItem(
                "Smoked Brisket Plate",
                "14-hour oak-smoked brisket with house BBQ sauce.",
                CourseCategories.MAIN_COURSE,
                28.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "Truffle Mac & Cheese",
                "Cheddar béchamel, white truffle oil, toasted breadcrumbs.",
                CourseCategories.MAIN_COURSE,
                20.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Buffalo Wings",
                "Crispy wings tossed in spicy buffalo sauce.",
                CourseCategories.APPETIZERS,
                14.00,
                EnumSet.noneOf(Allergens.class)
        ));

        addToMenu(new MenuItem(
                "New York Cheesecake",
                "Dense cream cheese filling over a graham crust.",
                CourseCategories.DESSERT,
                11.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));
    }
}