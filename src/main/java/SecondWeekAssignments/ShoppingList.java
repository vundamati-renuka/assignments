package SecondWeekAssignments;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    public static void main(String[] args) {

        HashMap<String, Integer> shoppingList = new HashMap<>();


        shoppingList.put("apple", 5);
        shoppingList.put("banana", 3);
        shoppingList.put("milk", 2);
        shoppingList.put("bread", 1);

        shoppingList.put("banana", shoppingList.get("banana") + 2);


        shoppingList.remove("milk");

        System.out.println("Final Shopping List:");
        for (Map.Entry<String, Integer> entry : shoppingList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

