package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date dateLastUpdated;

    //constructors
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public Menu(ArrayList<MenuItem> menuItems, Date dateLastUpdated) {
        this.menuItems = menuItems;
        this.dateLastUpdated = dateLastUpdated;
    }

    //menuItems getter & setter
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        this.menuItems = aMenuItems;
    }

    //dateLastUpdate getter & setter
    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }
    public void setDateLastUpdated(Date aDateLastUpdated) {
        this.dateLastUpdated = aDateLastUpdated;
    }
}
