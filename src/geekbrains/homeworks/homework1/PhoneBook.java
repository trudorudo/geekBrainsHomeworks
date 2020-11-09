package geekbrains.homeworks.homework1;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String lastName, String number){
        phoneBook.put(lastName, number);
    }
    public String get(String lastName){
        if (phoneBook.containsKey(lastName)) {
            return phoneBook.get(lastName);
        } else {
            System.out.println("lastname was not found");
        }
        return lastName;
    }
}
