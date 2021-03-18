package restaurant.classes;

import java.util.ArrayList;
import java.util.List;

public class CbbaRestaurant implements Restaurant {
    private String name;
    private String location;
    private List<String> categories;

    public CbbaRestaurant() {
        categories = new ArrayList<String>();
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public String GetLocation() {
        return location;
    }

    @Override
    public void SetLocation(String address) {
        this.location = address;
    }


    @Override
    public void AddCategory(String category) {
        categories.add(category);
    }

    @Override
    public List<String> GetCategories() {
        return categories;
    }

    @Override
    public void SetCategoryList(List<String> categories) {
        this.categories = categories;
    }
}
