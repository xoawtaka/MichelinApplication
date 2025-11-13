import java.util.ArrayList;
import java.util.List;

public class MichelinOrder implements Priceable, Readyable {

    private final Restaurant restaurant;
    private final DeliveryPriorities priority;
     //todo create customizable and dish class
    private ArrayList<CustomizedDish> dishes = new ArrayList<>();

    public MichelinOrder(Restaurant restaurant, DeliveryPriorities priority) {
        this.restaurant = restaurant;
        this.priority = priority;
    }

    public void addDish(CustomizedDish dish) {
        dishes.add(dish);
    }
    public ArrayList<CustomizedDish> getDishes() {
        return (ArrayList<CustomizedDish>) List.copyOf(dishes);
    }

    @Override
    public double getPrice() {
        return dishes.stream().mapToDouble(CustomizedDish::getPrice).sum();
    }

    @Override
    public boolean ready() {
        return !dishes.isEmpty();
    }

    @Override
    public int getEstimatedTimeMinutes () {
        double orderUnits = dishes.stream().mapToDouble(custom -> custom.getBaseItem().category().
                getTimeIndicatorUnit()).sum();

        double minutes = orderUnits ;

    }

//    public void setDishes(ArrayList<CustomizedDish> dishes) {
//        this.dishes = dishes;
//    }

    // todo list of customized dish and get method of dish
    //public ArrayList?<> getDishes() {
        // return ArrayList? .copy of dishes
    }


    // Overrides for order ready, presenting price, if its ready — Order wait time

        // (int) Math.ceil();

    // todo:  print receipt

//@Override
//public int hashCode() {
//    //idea taken from id generator in capstone
//    return ?.toUpperCase().hashCode();

