package restaurant;

import java.util.ArrayList;

public class Restaurant {

public static void main(String[] args) {

    //create several items
    MenuItem pasta = new MenuItem("Fancy Pasta","delicious buttery pasta","entree", 29.99, true);
    MenuItem noodles = new MenuItem("Noodles","delicious buttery pasta","entree", 29.99, true);
    MenuItem macaroni = new MenuItem("Macaroni","delicious buttery pasta","entree", 29.99, true);

    //add items to list
    ArrayList<MenuItem> pastaInc = new ArrayList<>();
    //add list to menu
    pastaInc.add(pasta);
    pastaInc.add(noodles);
    pastaInc.add(macaroni);
    //define last updated
    String dateLastUpdated = "Last Week";
    //create new menu
    Menu menu = new Menu(pastaInc, dateLastUpdated);
    //print whole menu
    menu.printMenu();
    //print individual item
    System.out.println(pasta);
    //delete, noodles, then reprint menu
    menu.removeItem(noodles);
    menu.printMenu();

}

}
