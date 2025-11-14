import java.rmi.NoSuchObjectException;
import java.util.*;
import java.util.List;

public abstract class Restaurant {

    private final String name;
    private final RestaurantCuisine cuisine;
    private final List<MenuItem> menu = new ArrayList<MenuItem>();
    private final double unitMinutes;

    protected Restaurant(String name, RestaurantCuisine cuisine, double unitMinutes) {
        this.name = Objects.requireNonNull(name);
        this.cuisine = Objects.requireNonNull(cuisine);
        if (unitMinutes <= 0) {
            throw new IllegalArgumentException("There is no order placed." +
                    "\nPlease return to home to place an order at your desired restaurant!");
        }
        this.unitMinutes = unitMinutes;

        //   invariant –unitMinutes > 0
        basicMenu();
    }


    protected abstract void basicMenu();

    protected void addToMenu(MenuItem item) {
        Objects.requireNonNull(item, "menu item must not be null");
        menu.add(item);
    }

    public List<MenuItem> menu() {
        return Collections.unmodifiableList(menu);
    }

    public String name() {
        return name;
    }

    public RestaurantCuisine cuisine() {
        return cuisine;
    }

    public double unitMinutes() {
        return unitMinutes;
    }

    public record CustomerOrder(MenuItem item, int quantity, EnumSet<Allergens> allergens) {

        public CustomerOrder {
            Objects.requireNonNull(item, "No items in order.");
            if (allergens.isEmpty()) {
                allergens = EnumSet.noneOf(Allergens.class);
            }

            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than 0");
            }
        }
    }
    //receipt for now =  time estimate, priority, lines, allergy notes.

    public record OrderSummary(int estimatedMinutes, DeliveryPriorities delivery, List<CustomerOrder> lines,
                               String allergyNotes) {

        public OrderSummary {
            Objects.requireNonNull(delivery);
            Objects.requireNonNull(lines);

            if (allergyNotes.isBlank() || allergyNotes.isEmpty()) {
                allergyNotes = "None";
            }
        }
    }
}



