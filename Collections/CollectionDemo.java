package Collections;

import java.util.ArrayList;
import java.util.HashMap;

// Definition:Collections គឺជា tools សម្រាប់ store data ច្រើន។

//     Collection                  Use For                             Example 
//     ArrayList                   List data តាម order                  Products list
//     HashMap                     Key-value dat                       userId→userName
//     HashSet                     Unique data                         unique phone numbers
//     Queue                       First in first out                  order queue

// Where use: Almost everywhere:app data,API response,database result.

// When use: ពេលមាន data ច្រើនជាង 1 item។
// Example:

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Phone");

        products.add("Laptop");

        products.add("Mouse");

        for (String product : products) {

            System.out.println(product);

        }

        HashMap<Integer, String> users = new HashMap<>();

        users.put(1, "Makara");

        users.put(2, "Dara");

        System.out.println(users.get(1));

    }
}
