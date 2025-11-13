import java.util.EnumSet;

public class CustomizedDish implements Priceable, Customizable {

    private final MenuItem baseItem;
    private EnumSet<Allergens> removedAllergens = EnumSet.noneOf(Allergens.class);

    public CustomizedDish(MenuItem baseItem, EnumSet<Allergens> removedAllergens) {
        this.baseItem = baseItem;
        this.removedAllergens = removedAllergens;
    }


    @Override
    public double getPrice() {
        return 0;
    }
}
