package solidexercises.personscheme;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class AdultInformationImpl implements AdultInformation {

    @Override
    public void workStatus(Adult child) {
        Random random = new Random();
        boolean isWorking = random.nextBoolean();
        if (isWorking) {
            System.out.println(child.getName() + " is working.");
        } else {
            System.out.println(child.getName() + " is not working.");
        }
    }
}
