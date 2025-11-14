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

    public static void showCuisineSelection(List<Restaurant> cuisines) {
        System.out.println("""
                
                -----------------------------
                 CHOOSE YOUR DESIRED CUISINE
                -----------------------------
                
                """);
        for (int i = 0; i < cuisines.size(); i++) {
            Restaurant restaurant = cuisines.get(i);
            System.out.printf("[%d] %s (%s)%n",
                    i + 1,
                    restaurant.getName(), restaurant.cuisine().getName;
        }
    }
}

