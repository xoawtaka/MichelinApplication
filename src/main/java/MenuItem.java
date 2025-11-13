import java.util.EnumSet;
import java.util.Objects;

public record MenuItem(String name, String description, CourseCategories category, double basePrice, EnumSet<Allergens> allergens) implements Priceable {

    public MenuItem {
        Objects.requireNonNull(name, "Name must be provided");
        Objects.requireNonNull(category, "Dish category must not be provided");
        if (basePrice < 0) {
            throw new IllegalArgumentException("Order price must be greater than 0");
        }
        description = description == null ? "" : description;
        allergens = allergens == null
                ? EnumSet.noneOf(Allergens.class)
                : EnumSet.copyOf(allergens);
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    public EnumSet<Allergens> allergens() {
        return EnumSet.copyOf(allergens);
    }
}

// todo: this is the base item BEFORE modifiers
// why: final price computed in CustomizedDish
