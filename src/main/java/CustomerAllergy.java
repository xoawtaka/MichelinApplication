import java.awt.*;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomerAllergy {

    private MenuItem item;
    private int quantity;
    private EnumSet<Allergens> allergens = EnumSet.noneOf(Allergens.class);
    // set allergies per order

    public CustomerAllergy(MenuItem item, int quantity) {
        this.item = Objects.requireNonNull(item, "Item must not be empty");
        this.quantity = quantity;

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }

    public MenuItem getItem() { //
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addAllergens(Allergens a) {
        allergens.add(a);
    }

    public void addAllergens(Collection<Allergens> all) {
        allergens.addAll(all); // idempotent
    }

    public EnumSet<Allergens> getAllergens() {
        return allergens;
    }


    public boolean hasAllergens() {
        return !allergens.isEmpty();
    }

    public String allergyList() {
        return allergens.isEmpty() ? "no allergens" : allergens.stream()
                .map(a -> a.name().toLowerCase())
                .collect(Collectors.joining());


     /*   if (allergens.isEmpty()) {
            return "No Allergens";
        }
        return allergens.stream()
                .map(a -> a.name().toLowerCase())
                .collect(Collectors.joining());*/
    }


}
