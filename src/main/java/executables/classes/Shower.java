package executables.classes;

import restaurant.classes.Restaurant;
import restaurant.classes.Singleton;

public class Shower implements Executable{
    @Override
    public void execute(int command) {
        System.out.println("RESTAURANTS");
        System.out.println("-----------");
        int index = 1;
        for (var restaurant: Singleton.getInstance().getRestaurantList())
        {
            System.out.println("\n" + index + "--------------");
            index++;
            System.out.println("name: " + restaurant.GetName());
            System.out.println("location: " + restaurant.GetLocation());
            System.out.println("categories: ");
            for (String cat :
                    restaurant.GetCategories()) {
                System.out.print("[ "+cat+" ]");
            }
        }

    }

    @Override
    public String getName() {
        return "Show";
    }
}
