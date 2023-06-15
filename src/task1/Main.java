package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        putInMap(product);
        replaceQuantity(product);
        addElement(product);
    }

    public static void putInMap(Map<String, Integer> map) {
        System.out.println("1.Current list of products and quantity:");
        map.put("Phone", 10);
        map.put("Laptop", 5);
        map.put("MacBook", 3);
        map.forEach((key, value) ->
                System.out.println("Name: " + key + "; Quantity:" + value)
        );

    }

    public static void replaceQuantity(Map<String, Integer> map) {
        System.out.println("\n2.Replaced list of products and quantity:");
        map.replace("Phone", 20);
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println("Name: " + m.getKey() + "; Quantity:" + m.getValue());
        }
    }

    public static void addElement(Map<String, Integer> map) {
        System.out.println("\n3.Add new product and quantity.\nNew list of products and quantity:");
        map.put("HeadPhones", 50);
        map.forEach((key, value) ->
                System.out.println("Name: " + key + "; Quantity:" + value)
        );
    }

}
