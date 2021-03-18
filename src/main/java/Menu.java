import executables.classes.*;
import factorys.CbbaRestaurantCreator;

import java.lang.ref.Cleaner;
import java.util.Hashtable;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Hashtable<String, Executable> executables;
    private final String PATH = "src/restaurants.json";
    private DoNothing doNothing;

    public Menu() {
        this.scanner = new Scanner(System.in);
        executables = new Hashtable<String,Executable>();
        executables.put("1",new Adder(new CbbaRestaurantCreator()));
        executables.put("3", new Editor());
        executables.put("4", new Deleter());
        executables.put("2",new Shower());
        executables.put("5",new Saver());
        doNothing = new DoNothing();

    }

    public void StartMenu()
    {

        System.out.println("\nMENU");
        System.out.println("------------");;
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Save");

        System.out.println("Select a command from 1 to n : ");
        String key = scanner.nextLine();
        System.out.flush();
        executables.getOrDefault(key,doNothing).execute(0);

    }
}
