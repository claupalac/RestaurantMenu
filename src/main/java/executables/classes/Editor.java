package executables.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Editor implements Executable{
    private List<Executable> services;

    public Editor() {
        this.services = new ArrayList<Executable>();
        services.add(new NameEditor());
        services.add(new LocationEditor());
        services.add(new CategoriesEditor());
    }

    @Override
    public void execute(int command) {
        Shower shower = new Shower();
        shower.execute(0);

        System.out.println("Select a command 1-n: ");
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());

        ShowNextMenu(key);
    }

    @Override
    public String getName() {
        return "Editor";
    }


    private void ShowNextMenu(int command)
    {
        int index = 1;
        for (Executable actionService: services)
        {
            System.out.println(index + ".- "+ actionService.getName());
            index++;
        }
        Scanner scanner = new Scanner(System.in);
        String keyString = scanner.nextLine();
        int key = Integer.parseInt(keyString);

        services.get(key-1).execute(command);
    }


}
