import java.io.PrintStream;
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

    public static void showMenuByCategory(List<MenuItem> items) {
        System.out.println("Course Categories:\n");

        for (CourseCategories category:CourseCategories.values()) {
            System.out.printf("%s:%n", category.name());

            int i = 0;
            for (MenuItem course:items) {
                if (course.category() == category) {
                    System.out.printf("  [%d] %s | $%.2f%n", i, course.name(), course.basePrice());
                    System.out.printf("%s%n", course.description());
                    i++;
                }
            }

        }

        System.out.println("Please enter the course number to add to your order, or 0 to checkout: ");


    } // I think I want to make it to users can a let


    public static void showInvalidInput() {
    }
}

