import java.awt.*;
import java.util.EnumSet;
import java.util.Objects;

public class CustomerAllergy {

    private MenuItem item;
    private int quantity;
    private EnumSet<Allergens> allergens = EnumSet.noneOf(Allergens.class);
    // set allergies per order

    public CustomerAllergy(MenuItem item, int quantity) {
        this.item = Objects.requireNonNull(item, "item must not be empty");
        this.quantity = quantity;

        if  (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }

    private boolean hasAllergens;



    public EnumSet<Allergens> getAllergens() {
        return allergens;
    }

    public void setAllergens(EnumSet<Allergens> allergens) {
        this.allergens = allergens;
    }
}
