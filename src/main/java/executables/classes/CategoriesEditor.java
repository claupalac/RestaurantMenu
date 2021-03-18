package executables.classes;

import restaurant.classes.Singleton;

import java.util.Scanner;

public class CategoriesEditor implements Executable{

    private Scanner scanner;

    public CategoriesEditor() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public void execute(int command) {
        System.out.println("New Category: ");
        String category = scanner.nextLine();
        Singleton.getInstance().getRestaurantList().get(command-1).AddCategory(category);
    }

    @Override
    public String getName() {
        return "Add new category";
    }
}
