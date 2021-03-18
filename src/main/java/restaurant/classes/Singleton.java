package restaurant.classes;

import factorys.CbbaRestaurantCreator;
import json.classes.JsonFileReader;

import java.util.List;

public class Singleton {
    private static Singleton instance;
    private List<Restaurant> restaurantList;

    private Singleton() {
        JsonFileReader jsonFileReader = new JsonFileReader(new CbbaRestaurantCreator());
        jsonFileReader.readFile();
        restaurantList = jsonFileReader.getRestaurantList();
    }

    public static Singleton getInstance()
    {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public List<Restaurant> getRestaurantList()
    {
        return restaurantList;
    }
}
