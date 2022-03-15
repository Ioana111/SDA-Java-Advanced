package ro.sda.ioana.collections.list.arraylist.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a List and display its result (data should be provided by the user - console):
 * - Purchases to be made. *If an element already exists on the list, then it should not be added.
 * - *Add to the example above the possibility of "deleting" purchased elements
 * - Display only those purchases that start with „m" (e.g. milk)
 * - *View only purchases whose next product on the list starts with „m" (e.g. eggs, if milk was next on the list)
 */


public class Main {
    public static void main(String[] args) {

        List<String> products = new ArrayList<>();
        products.add("milk");
        products.add("bread");
        products.add("eggs");
        products.add("mellon");

        System.out.println(products);

        String product = "water";

        if (!products.contains(product)) {
            products.add(product);
        }

        System.out.println(products);

//        products.remove("bread");
//        products.remove("cheese");
//
//        System.out.println(products);
//        products.remove(2);
//        System.out.println(products);

        for (String product1 : products) {
            if (product1.startsWith("m")) {
                System.out.println(product1);
            }
        }

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).startsWith("m")) {
                if (i >= 1) {
                    System.out.println(products.get(i - 1));
                }
            }

        }


    }
}
