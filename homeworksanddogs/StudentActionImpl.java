package homeworksanddogs;

import java.util.Random;

public class StudentActionImpl implements MainAction, StudentAction {

    @Override
    public boolean isWritten() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void introduce(Person person) {
        System.out.println("Hi, my name is " + person.getName());
    }
}
