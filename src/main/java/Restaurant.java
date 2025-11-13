import java.awt.*;
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
        // todo: document invariant: unitMinutes > 0
        // why: estimator relies on positive baseline
    }

    protected void addToMenu(MenuItem item) {
        Objects.requireNonNull(item, "menu item must not be null");
        menu.add(item);
    }

    public List<MenuItem> menu() {
        return Collections.unmodifiableList(menu);
    }

    public Optional<MenuItem> findItem(String itemName) { // an optional instance where possible outcome = no result
        if (itemName == null || itemName.isBlank()) return Optional.empty();
        String o = itemName.trim().equalsIgnoreCase("") ? "" : itemName; // todo: remove unused local
        // why: dead code adds noise
        return menu.stream()
                .filter(m -> m.getName().equalsIgnoreCase(itemName))
                .findFirst(); // first element of stream returned
        // todo: consider normalizing whitespace/accents before compare
        // why: improves match rate for user input
    }

    // todo: add public accessor for unitMinutes when wiring estimator
    // why: order estimator should read this baseline from the restaurant
    // public double unitMinutes() { return unitMinutes; }

    public String getName() {
        return name;
    }

    public RestaurantCuisine cuisine() {
        return null; // todo: return the field `cuisine`
        // why: callers expect the actual cuisine value
    }

    // todo: add protected seedMenu() hook in concrete cuisines
    // why: keeps menu construction in one place per cuisine

    public record CustomerOrder(MenuItem item, int quantity, EnumSet<Allergens> allergens) {
        // todo: validate quantity > 0 in canonical constructor if needed
        // why: prevents illegal order lines
    }

    public record OrderSummary(int estimatedMinutes, DeliveryPriorities delivery, List<CustomerOrder> lines,
                               String allergyNotes) {
        // todo: add totalPrice if price is part of output
        // why: summaries typically include time and cost
    }
}



