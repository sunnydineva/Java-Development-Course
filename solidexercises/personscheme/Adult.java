package solidexercises.personscheme;

import java.util.List;
import java.util.Map;

public class Adult extends Person{

    private String hobby;

    public Adult(String name, int age, Map<String, List<Street>> addresses, String hobby) {
        super(name, age, addresses);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    void tellAddress(Person person) {
        Map<String, List<Street>> addresses = person.getAddresses();
        for (Map.Entry<String, List<Street>> address : addresses.entrySet()) {
            System.out.println("In " + address.getKey());
            for (Street street : address.getValue()) {
                System.out.println(street);
            }
        }
    }
}
