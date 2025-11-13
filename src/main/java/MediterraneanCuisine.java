import java.util.EnumSet;

public class MediterraneanCuisine extends Restaurant {

    public MediterraneanCuisine() {
        super("Aegean Ember", RestaurantCuisine.MEDITERRANEAN, 7);

        addToMenu(new MenuItem(
                "Lamb Gyro Plate",
                "Marinated lamb, pita, tzatziki, fresh tomato, and onion.",
                CourseCategories.MAIN_COURSE,
                24.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Falafel Mezze",
                "Herb falafel with tahini, hummus, and pickled vegetables.",
                CourseCategories.APPETIZERS,
                12.00,
                EnumSet.of(Allergens.SOY)
        ));

        addToMenu(new MenuItem(
                "Spanakopita",
                "Crispy phyllo pastry with spinach and feta.",
                CourseCategories.MAIN_COURSE,
                16.00,
                EnumSet.of(Allergens.DAIRY, Allergens.GLUTEN)
        ));

        addToMenu(new MenuItem(
                "Baklava",
                "Honey-soaked phyllo layered with pistachios and walnuts.",
                CourseCategories.DESSERT,
                10.00,
                EnumSet.of(Allergens.NUTS, Allergens.GLUTEN, Allergens.DAIRY)
        ));
    }
}