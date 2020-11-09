package geekbrains.homeworks.homework1;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String>  myWords = Arrays.asList(
                "cat", "dog", "horse", "parrot", "cat", "cat",
                "rat", "lion", "rabbit", "parrot", "lion", "rabbit",
                "dog", "rabbit"
                );

           Set<String> uniqueWords = new HashSet<>();

           for(String word : myWords){
               System.out.println("Word " + word +"was repeated" + Collections.frequency(myWords, word) +"times");
           }

           for(String word : myWords){
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);

           PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Petrov", "9064637457");
            phoneBook.add("Ivanov", "75467898");
            phoneBook.add("Volkov", "79708086");
            phoneBook.add("Ivanov", "46377344");

        System.out.println(phoneBook.get("Volkov"));

   }
}

