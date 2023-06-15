package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> goods = new HashMap<>();
        putInMap(goods);
        findElement(goods);
    }

    public static void putInMap(Map<String, Integer> map) {
        System.out.println("1.Current list of products and quantity:");
        map.put("Apple", 6);
        map.put("Orange", 5);
        map.put("Lemon", 3);
        map.forEach((key, value) ->
                System.out.println("Name: " + key + "; Quantity:" + value)

        );
    }

    public static void findElement(Map<String, Integer> map) {
        System.out.println("\n2.Found quantity by name.\nEnter name of product: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        String findResult = null;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (name.equalsIgnoreCase(m.getKey())) {
                findResult = m.getKey();
            }
        }
        if (findResult != null) {
            Integer value = map.get(findResult);
            System.out.println("Name: " + findResult + "; Quantity:" + value);

        } else {
            System.out.println("This element is NOT FOUND!");
        }

    }
}
