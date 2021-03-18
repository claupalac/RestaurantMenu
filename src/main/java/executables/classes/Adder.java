package executables.classes;

import factorys.Creator;
import restaurant.classes.Restaurant;
import restaurant.classes.Singleton;

import java.util.Scanner;

public class Adder implements Executable {
   private Scanner scanner;
   private Creator creator;

    public Adder(Creator aCreator) {
        scanner = new Scanner(System.in);
        creator = aCreator;
    }

    @Override
    public void execute(int command) {
        System.out.println("ADD");
        System.out.println("______________");
        Restaurant newRestaurant = CreateNewRestaurant();
        Singleton.getInstance().getRestaurantList().add(newRestaurant);
    }

    @Override
    public String getName() {
        return "Create";
    }


    private Restaurant CreateNewRestaurant()
    {
        Restaurant restaurant = creator.createRestaurant();
        restaurant.SetName(GetStringFromConsole("Name"));
        restaurant.SetLocation(GetStringFromConsole("Address"));
        restaurant.AddCategory(GetStringFromConsole("Category"));
        return restaurant;
    }


    private String GetStringFromConsole(String requestValue)
    {
        System.out.print(requestValue + ": ");
        return scanner.nextLine();
    }

}
