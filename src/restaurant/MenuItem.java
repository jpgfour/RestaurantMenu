package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean newItem;
    //private int newDays;

    //constructors
    public MenuItem(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public MenuItem(String name, String description, String category, double price, boolean newItem) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }

    //name getter & setter
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    //description getter & setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    //category getter & setter
    public String getCategory() {
        return category;
    }
    public void setClassID(String aCategory){
        category = aCategory;
    }

    //price getter & setter
    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    //newItem getter & setter
    public boolean getNewItem() {
        return newItem;
    }
    private void setNewItem(boolean aNewItem) {
        newItem = aNewItem;
    }

}
