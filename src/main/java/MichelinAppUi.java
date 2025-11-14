import java.io.PrintStream;
import java.util.List;

import static java.lang.System.out;

public class MichelinAppUi {

    private MichelinAppUi() {
    }

    public static void showWelcome() {
        out.println("""
                
                <<<<<<<<<<<<<<>>>>>>>>>>>>>
                  Michelin Star Plaza
                <<<<<<<<<<<<<<>>>>>>>>>>>>>
                
                Welcome to the Michelin Plaza where your cravings become our priority.
                
                Please choose your desired cuisine, select your course(s) and place your order!
                
                """);
    }

    public static void showCuisineSelection(List<Restaurant> cuisines) throws InterruptedException {
        out.println("""
                
                -----------------------------
                 CHOOSE YOUR DESIRED CUISINE
                -----------------------------
                
                """);
        for (int i = 0; i < cuisines.size(); i++) {

            Restaurant restaurant = cuisines.get(i);
            out.printf("[%d] %s (%s)%n",
                    i + 1, restaurant.getName(), restaurant.cuisine().name());
        }

        out.println("Let's see what Michelin Restaurants are in your area!");

        out.println("Loading...");
        Thread.sleep(1500);
        out.println("""
                Great News!!!
                
                These are the Michelin restaurants within your area!
                
                \nPlease enter the number of the cuisine type you'd like to order from.
                """);
    }

    public static void showMenuHeader(Restaurant restaurant) {
        out.println("""
                
                <<<<<<<<<<>>>>>>>>>
                        MENU
                <<<<<<<<<<>>>>>>>>>
                
                """);

        out.printf("Restaurant: %s (%s)%n%n",
                restaurant.getName(), restaurant.cuisine().name());

    }

    public static void showMenuByCategory(List<MenuItem> items) {
        out.println("Course Categories:\n");

        for (CourseCategories category:CourseCategories.values()) {
            out.printf("%s:%n", category.name());

            items.stream().filter(course -> course.category() == category)
                    .forEach(course -> {
                        PrintStream System.;out.printf("%s | $%.2f | %s%n", course.name(), course.basePrice(), course.description()
                    });
        }

    } // I think I want to make it to users can a let




}

