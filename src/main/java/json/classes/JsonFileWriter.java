package json.classes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import restaurant.classes.Restaurant;
import restaurant.classes.Singleton;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    private FileWriter file;

    public JsonFileWriter(FileWriter file)
    {
        this.file = file;
    }

    public void WriteJsonFile()
    {
        JSONArray jsonArray = GetJsonArrayFromList();
        try {
            file.write(jsonArray.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                file.flush();
                file.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    private JSONArray GetJsonArrayFromList()
    {
        JSONArray jsonArray = new JSONArray();
        for (Restaurant aRestaurant : Singleton.getInstance().getRestaurantList())
        {
            JSONObject jsonObject = ConvertJSONObject(aRestaurant);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    public JSONObject ConvertJSONObject(Restaurant restaurant)
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",restaurant.GetName());
        jsonObject.put("location",restaurant.GetLocation());
        jsonObject.put("categories",FillJsonCategory(restaurant));
        return jsonObject;
    }

    private JSONArray FillJsonCategory(Restaurant restaurant)
    {
        JSONArray jsonArray = new JSONArray();
        jsonArray.addAll(restaurant.GetCategories());
        return jsonArray;
    }
}
