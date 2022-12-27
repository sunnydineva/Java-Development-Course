package advanceacademyoop.solidexercises.phonebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPhoneBook {

    /*
     1зад. Даден е телефонен справочник, в който срещу дадено име има телефонен номер. Да се напише
програма, която при подаден списък от имена отпечатва номера на всеки човек. Ако това име не
присъства в справочника, то трябва да се отпечата съобщение.
Пример:
Данни:
Ivan – 123456789
Spas – 987654321
Ivana – 159357486
Spasimira – 357951426
Търсят се номерата на – Spasimira, Ivan и Georgi
Резултат:
Spasimira – 357951426
Ivan – 123456789
Georgi – no such record
     */
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
