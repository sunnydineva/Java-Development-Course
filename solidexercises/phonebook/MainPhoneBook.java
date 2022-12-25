package solidexercises.phonebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPhoneBook {
    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", "123456789");
        phoneBook.put("Spas", "987654321");
        phoneBook.put("Ivana", "159357486");
        phoneBook.put("Spasimira", "357951426");

        List<String> people = Arrays.asList("Spasimira", "Ivana", "Georgi");

        for (String person : people) {
            boolean isFound = false;
            for (Map.Entry<String, String> phonePerson : phoneBook.entrySet()) {
                String personName = phonePerson.getKey();

                if (person.equals(personName)) {
                    System.out.println(personName + " - " + phonePerson.getValue());
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println(person + " - no such record");
            }
        }
    }
}
