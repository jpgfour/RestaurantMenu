package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private String dateLastUpdated;

    //constructors
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public Menu(ArrayList<MenuItem> menuItems, String dateLastUpdated) {
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
    public String getDateLastUpdated() {
        return dateLastUpdated;
    }
    public void setDateLastUpdated(String aDateLastUpdated) {
        this.dateLastUpdated = aDateLastUpdated;
    }

    //add remove item
    public void addItem(MenuItem menuItem) {
        //screen out equal items
        this.menuItems.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        //screen out equal items
        if (this.menuItems.contains(menuItem)) {
//            int j = this.menuItems.indexOf(menuItem);
//            this.menuItems.remove(j);
            this.menuItems.remove(menuItem);
        }
    }

    //is menu item new?
    public boolean isMenuItemNew(MenuItem menuItem){
        return menuItem.getNewItem();
    }

    //menu last updated...use getter


    //print menu
    public void printMenu() {
        for (MenuItem item : this.menuItems) {
            System.out.println(item);
        }
    }


}
