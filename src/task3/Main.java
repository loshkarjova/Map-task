package task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        putInMap(contacts);
        changeValue(contacts);
        outputResult(contacts);
    }

    public static void putInMap(LinkedHashMap<String, String> map) {
        System.out.println("1.Current list of contacts: ");
        map.put("ANN", "ann@gmail.com");
        map.put("ALEX", "alex@gmail.com");
        map.put("TOM", "tom@gmail.com");
        map.put("HELEN", "helen@gmail.com");
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("Name: " + m.getKey() + "; Email: " + m.getValue());
        }
    }

    public static void changeValue(LinkedHashMap<String, String> map) {
        System.out.println("\n--------------");
        System.out.println("Which contact wants to change email? Enter: ");
        Scanner scanner = new Scanner(System.in);
        String contact = scanner.nextLine().toUpperCase().trim();
        System.out.println("Enter new email for contact " + contact + ":");
        String newEmail = scanner.nextLine();
        if (map.containsKey(contact)) {
            map.replace(contact, map.get(contact), newEmail);
            System.out.println("Contact " + contact + " changed email. New contact's email is " + newEmail);
        } else {
            System.out.println("Contact " + contact + " is absent!");
        }
    }

    public static void outputResult(LinkedHashMap<String, String> map) {
        System.out.println("\nRefactored list of contacts: ");
        System.out.println("\n--------------");
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("Name: " + m.getKey() + "; Email: " + m.getValue());
        }
    }
}
