package restaurant;

import java.util.ArrayList;

public class Restaurant {

public static void main(String[] args) {

    MenuItem pasta = new MenuItem("Fancy Pasta","delicious buttery pasta","entree", 29.99, true);
    MenuItem noodles = new MenuItem("Noodles","delicious buttery pasta","entree", 29.99, true);
    MenuItem macaroni = new MenuItem("Macaroni","delicious buttery pasta","entree", 29.99, true);

    ArrayList<MenuItem> itemList = new ArrayList<>();
    String dateLastUpdated = "Last Week";

    Menu menu = new Menu(itemList, dateLastUpdated);

}

}
