import java.util.List;

public class MichelinAppUi {

    private MichelinAppUi() {
    }

    public static void showWelcome() {
        System.out.println("""
                
                <<<<<<<<<<<<<<>>>>>>>>>>>>>
                  Michelin Star Plaza
                <<<<<<<<<<<<<<>>>>>>>>>>>>>
                
                Welcome to the Michelin Plaza where your cravings become our priority.
                
                Please choose your desired cuisine, select your course(s) and place your order!
                
                """);
    }

    public static void showCuisineSelection(List<Restaurant> cuisines) throws InterruptedException {
        System.out.println("""
                
                -----------------------------
                 CHOOSE YOUR DESIRED CUISINE
                -----------------------------
                
                """);
        for (int i = 0; i < cuisines.size(); i++) {

            Restaurant restaurant = cuisines.get(i);
            System.out.printf("[%d] %s (%s)%n",
                    i + 1, restaurant.getName(), restaurant.cuisine().name());
        }

        System.out.println("Let's see what Michelin Restaurants are in your area!");

        System.out.println("Loading...");
        Thread.sleep(1500);
        System.out.println("""
                Great News!!!
                
                These are the Michelin restaurants within your area!
                
                \nPlease enter the number of the cuisine type you'd like to order from.
                """);
    }

    public static void showMenuHeader(Restaurant restaurant) {
        System.out.println("""
                
                <<<<<<<<<<>>>>>>>>>
                        MENU
                <<<<<<<<<<>>>>>>>>>
                
                """);

        System.out.printf("Restaurant: %s (%s)%n%n",
                restaurant.getName(), restaurant.cuisine().name());

    }




}

