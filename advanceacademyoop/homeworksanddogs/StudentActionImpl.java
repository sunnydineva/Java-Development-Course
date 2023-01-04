package advanceacademyoop.homeworksanddogs;

import java.util.Random;

public class StudentActionImpl implements StudentAction {

    @Override
    public boolean isWritten() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
