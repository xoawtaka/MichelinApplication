import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class CustomizedDish implements Priceable, Customizable {
    private final MenuItem baseItem;
    private final List<CourseModifier> modifiers = new ArrayList<>();
    private final EnumSet<Allergens> removedAllergens = EnumSet.noneOf(Allergens.class);

    public CustomizedDish(MenuItem baseItem) {
        this.baseItem = baseItem;
    }
    public double getBaseItem() {
        return baseItem;
    }

    public void addModifier(CourseModifier mod) {
        modifiers.add(mod);
    }

    public void removeAllergen(Allergens allergen) {
        removedAllergens.add(allergen);
    }

    public EnumSet<Allergens> getRemovedAllergens() {
        return EnumSet.copyOf(removedAllergens);
    }

    public List<CourseModifier> getModifiers() {
        return List.copyOf(modifiers);
    }

    @Override
    public double getPrice() {
        double sum = baseItem.getPrice();
        sum += modifiers.stream().mapToDouble(CourseModifier::getPrice).sum();
        return sum;

        // return 0;
    }

    // todo: print logic for custom summary (name, removed allergens, add-ons)
}