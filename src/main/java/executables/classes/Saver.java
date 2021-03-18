package executables.classes;
import factorys.CbbaRestaurantCreator;
import json.classes.JsonFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Saver implements Executable{

    private final String PATH = "src/restaurants.json";
    @Override
    public void execute(int command) {

        JsonFileWriter jsonFileWriter;
        try {
            jsonFileWriter = new JsonFileWriter(new FileWriter(PATH));
            jsonFileWriter.WriteJsonFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return "Save";
    }
}
