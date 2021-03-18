package executables.classes;

import restaurant.classes.Singleton;

import java.util.Scanner;

public class LocationEditor implements Executable{

    private Scanner scanner;

    public LocationEditor() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public void execute(int command) {
        System.out.println("New Location: ");
        String newLocation = scanner.nextLine();
        Singleton.getInstance().getRestaurantList().get(command-1).SetLocation(newLocation);
    }

    @Override
    public String getName() {
        return "Edit Location";
    }
}
