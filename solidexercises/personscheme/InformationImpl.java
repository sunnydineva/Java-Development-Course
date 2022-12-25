package solidexercises.personscheme;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class InformationImpl implements Information {

    @Override
    public void describePerson(Person person) {
        System.out.println("I'm " + person.getName() + ", I'm " + person.getAge() + "-years old");
    }

    @Override
    public void tellAddress(Person person) {
        if (Adult.class.isInstance(person)) {
            Map<String, List<Street>> addresses = person.getAddresses();
            for (Map.Entry<String, List<Street>> address : addresses.entrySet()) {
                System.out.println("In " + address.getKey());
                for (Street street : address.getValue()) {
                    System.out.println(street);
                }
            }
        } else if (Child.class.isInstance(person)) {
            System.out.println("I won't tell my address");
        }
    }

    @Override
    public void playStatus(Child child) {
        Random random = new Random();
        boolean isPlaying = random.nextBoolean();
        if (isPlaying) {
            System.out.println(child.getName() + " is playing.");
        } else {
            System.out.println(child.getName() + " is not playing.");
        }
    }

    @Override
    public void workStatus(Adult child) {
        Random random = new Random();
        boolean isWorking = random.nextBoolean();
        if (isWorking) {
            System.out.println(child.getName() + "is working.");
        } else {
            System.out.println(child.getName() + "is not working.");
        }
    }
}
