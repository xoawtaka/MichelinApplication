import java.util.List;
import java.util.Scanner;

public class MainMichelinDisplay {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

    }

    private static List<Restaurant.CustomerOrder> selectDishes(Restaurant restaurant, List<MenuItem> numberedMenu) {
    }

    private static List<MenuItem> buildNumberedMenu(List<MenuItem> menu) {
    }

    private static Restaurant chooseCuisines(List<Restaurant> cuisines) throws InterruptedException {

        boolean isRunning = true;

        while (isRunning) {

            MichelinAppUi.showCuisineSelection(cuisines);
            String cuisineChoice = input.nextLine().trim();

            switch (cuisineChoice) {
                case "1" -> {
                    return cuisines.get(0);
                }
                case "2" -> {
                    return cuisines.get(1);
                }
                case "3" -> {
                    return cuisines.get(2);
                }
                case "4" -> {
                    return cuisines.get(3);
                }
                default -> MichelinAppUi.showInvalidInput();
            }
        }
    }
}
