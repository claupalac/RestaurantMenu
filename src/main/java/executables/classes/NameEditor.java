package executables.classes;

import restaurant.classes.Singleton;

import java.util.Scanner;

public class NameEditor implements Executable{

    private Scanner scanner;

    public NameEditor() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public void execute(int command) {
        System.out.println("New Name: ");
        String newName = scanner.nextLine();
        Singleton.getInstance().getRestaurantList().get(command-1).SetName(newName);
    }

    @Override
    public String getName() {
        return "Edit name";
    }
}
