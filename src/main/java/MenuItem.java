import java.util.EnumSet;
import java.util.List;
import java.util.Objects;

public class MenuItem implements Priceable {
    private final String name;
    private final String description;
    private final CourseCategories category;
    private final double basePrice;
    private final EnumSet<Allergens> allergens;

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

    public String getName() { return name; }
    public String getDescription() { return description; }
    public CourseCategories getCategory() { return category; }
    public EnumSet<Allergens> getAllergens() { return EnumSet.copyOf(allergens); }

    @Override
    public double getPrice() { return basePrice; }

    // todo: this is the base item BEFORE modifiers
    // why: final price computed in CustomizedDish
}