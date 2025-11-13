import java.util.ArrayList;
import java.util.List;

public class MichelinOrder implements Priceable, Readyable {

    private final Restaurant restaurant;
    private final DeliveryPriorities priority;
     //todo create customizable and dish class

    public MichelinOrder(Restaurant restaurant, DeliveryPriorities priority) {
        this.restaurant = restaurant;
        this.priority = priority;
    }

    public void addDish(String dishes) {
        this.addDish(dishes);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean ready() {
        return false;
    }

    @Override
    public void getEstimatedTimeMinutes(int time, int ordersize) {

    }

    // todo list of customized dish and get method of dish
    //public ArrayList?<> getDishes() {
        // return ArrayList? .copy of dishes
    }


    // Overrides for order ready, presenting price, if its ready — Order wait time

        // (int) Math.ceil();

    // todo:  print receipt

