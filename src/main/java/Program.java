import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        String path = "src/restaurants.json";
        Menu menu = new Menu();
        while (true)
        {
            menu.StartMenu();
            System.out.flush();
        }

    }



}
