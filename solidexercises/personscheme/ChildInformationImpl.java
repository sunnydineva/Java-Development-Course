package solidexercises.personscheme;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChildInformationImpl implements ChildInformation {

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
}
