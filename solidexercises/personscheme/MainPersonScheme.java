package solidexercises.personscheme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPersonScheme {
    public static void main(String[] args) {
        Street str1 = new Street("Victory", 5);
        Street str2 = new Street("Hope", 15);
        Street str3 = new Street("Love", 3);
        Street str4 = new Street("Apple", 98);

        Map<String, List<Street>> addrAdult = new HashMap<>();
        addrAdult.put("Sofia", Arrays.asList(str1, str2));
        addrAdult.put("Varna", Arrays.asList(str3));

        Map<String, List<Street>> addrChild = new HashMap<>();
        addrChild.put("Plovdiv", Arrays.asList(str4));

        Adult adult = new Adult("Petyr", 35, addrAdult, "fishing");
        Child child = new Child("Nikolay", 9, addrChild, "blue");

        Information info = new InformationImpl();

        info.describePerson(adult);
        info.tellAddress(adult);
        info.workStatus(adult);
        System.out.println("-------------------");

        info.describePerson(child);
        info.tellAddress(child);
        info.playStatus(child);
    }

}
