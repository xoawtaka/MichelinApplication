import java.util.EnumSet;
import java.util.Objects;

public record MenuItem(String name, String description, CourseCategories category, double basePrice,
                       EnumSet<Allergens> allergens) implements Priceable {
    public MenuItem(String name, String description,
                    CourseCategories category, double basePrice,
                    EnumSet<Allergens> allergens) {

        this.name = Objects.requireNonNull(name);
        this.description = description == null ? "" : description;
        this.category = Objects.requireNonNull(category);
        this.basePrice = basePrice;
        this.allergens = allergens == null
                ? EnumSet.noneOf(Allergens.class)
                : EnumSet.copyOf(allergens);
    }

    @Override
    public EnumSet<Allergens> allergens() {
        return EnumSet.copyOf(allergens);
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    // todo: this is the base item BEFORE modifiers
    // why: final price computed in CustomizedDish
}