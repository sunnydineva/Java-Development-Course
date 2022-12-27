package solidexercises.personscheme;

import java.util.List;
import java.util.Map;

public abstract class Person {
    private String name;
    private int age;
    private Map<String, List<Street>> addresses;

    public Person(String name, int age, Map<String, List<Street>> addresses) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
    }

    public void describePerson(Person person) {
        System.out.println("I'm " + person.getName() + ", I'm " + person.getAge() + "-years old");
    }
    abstract void tellAddress(Person person);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, List<Street>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<Street>> addresses) {
        this.addresses = addresses;
    }
}
