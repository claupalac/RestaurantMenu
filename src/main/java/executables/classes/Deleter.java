package executables.classes;

import restaurant.classes.Singleton;

import java.util.Scanner;

public class Deleter implements Executable{
    @Override
    public void execute(int command) {

        Shower shower = new Shower();
        shower.execute(0);

        System.out.println("To Delete select a command from 1 to n : ");
        Scanner scanner = new Scanner(System.in);
        String keyString = scanner.nextLine();
        int key = Integer.parseInt(keyString);

        System.out.println("Deleting " + Singleton.getInstance().getRestaurantList().get(key-1).GetName());
        Singleton.getInstance().getRestaurantList().remove(key-1);
    }

    @Override
    public String getName() {
        return "Delete";
    }

}
