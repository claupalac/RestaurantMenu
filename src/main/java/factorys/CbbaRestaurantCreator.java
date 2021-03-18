package factorys;

import restaurant.classes.CbbaRestaurant;
import restaurant.classes.Restaurant;

public class CbbaRestaurantCreator extends Creator {
    @Override
    public Restaurant createRestaurant() {
        return new CbbaRestaurant();
    }
}
