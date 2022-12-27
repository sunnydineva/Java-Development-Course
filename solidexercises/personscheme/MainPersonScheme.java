package solidexercises.personscheme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPersonScheme {
    /*
    4зад. В една система се съхранява информация за всеки пълнолетен човек и всяко дете по следния начин:
Пълнолетен:
- име
- години
- адреси, които представляват град, улица, номер, като в един град човек може да е живял
на различни улици
- хоби
Дете:
- име
- години
- адреси, които представляват град, улица, номер, като в един град човек може да е живял
на различни улици
- любим цвят
Всеки човек, независимо от възрастта си, може да се опише, като си каже името и годините.
Ако едно дете е попитано за адреса му, то ще откаже да си го каже.
Ако един пълнолетен е попитан за адреса си, той ще го каже.
Ако едно дете играе (случва се на случаен принцип), то системата извежда неговото име и каза, че играе.
Ако един възрастен работи (случва се на случаен принцип), то системата извежда неговото име и казва,
че работи.
Пример:
Данни за пълнолетен човек –
- име: Иван
- години: 35
- адреси:
1) София – ул. „Победа“ #10
2) София – ул. „Надежда“ #5
3) Варна – ул. „Лале“ #1
- хоби: да спортува
Данни за дете –
- име: Радо
- години: 9
- адреси:
1) Пловдив – ул. „Ябълка“ #10
- любим цвят: зелен
Примерен изход от програмата:
Моето име е Иван, аз съм на 35.
Моите адреси са:
В София –
ул. „Победа“ #10
ул. „Надежда“ #5
Във Варна –
ул. „Лале“ #1
Иван работи в момента.
Моето име е Радо, аз съм на 9.
Моите адреси са:
Аз съм дете, няма да кажа къде живея!
Радо не играе в момента.
     */
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

        ChildInformation childInfo = new ChildInformationImpl();
        AdultInformation adultInfo = new AdultInformationImpl();

        adult.describePerson(adult);
        adult.tellAddress(adult);
        adultInfo.workStatus(adult);
        System.out.println("-------------------");

        child.describePerson(child);
        child.tellAddress(child);
        childInfo.playStatus(child);
    }

}
