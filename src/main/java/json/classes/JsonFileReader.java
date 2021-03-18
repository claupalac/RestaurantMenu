package json.classes;

import factorys.Creator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import restaurant.classes.Restaurant;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonFileReader {

    private final String filePath = "src/restaurants.json";
    private List<Restaurant> restaurantList;
    private Creator creator;

    public JsonFileReader(Creator creator) {
        this.creator = creator;
        restaurantList = new ArrayList<Restaurant>();
    }


    public void readFile() {

        try
        {
            FileReader fileReader = new FileReader(filePath);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) obj;
            for(Object object : jsonArray)
            {
                addRestaurantObject(object);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void addRestaurantObject(Object object)
    {
        JSONObject jsonRestaurant = (JSONObject) object;
        Restaurant newRestaurant = creator.createRestaurant();
        newRestaurant.SetName((String) jsonRestaurant.get("name"));
        newRestaurant.SetLocation((String) jsonRestaurant.get("location"));
        JSONArray categories = (JSONArray) jsonRestaurant.get("categories");
        for(Object c : categories)
        {
            newRestaurant.AddCategory((String) c);
        }
        this.restaurantList.add(newRestaurant);
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
}
