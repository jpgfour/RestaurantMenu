package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> dishes;
    private Date dateLastUpdated;

    //constructors
    public Menu(ArrayList<MenuItem> dishes) {
        this.dishes = dishes;
    }
    public Menu(ArrayList<MenuItem> dishes, Date dateLastUpdated) {
        this.dishes = dishes;
        this.dateLastUpdated = dateLastUpdated;
    }
}
