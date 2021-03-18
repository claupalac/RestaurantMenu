package restaurant.classes;

import java.util.List;

public interface Restaurant {
    String GetName();

    void SetName(String name);

    String GetLocation();

    void SetLocation(String address);

    void AddCategory(String category);

    List<String> GetCategories();

    void SetCategoryList(List<String> categories);
}
