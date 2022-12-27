package homeworksanddogs;

public class Dog {
    private String dogName;
    private String dogBreed;
    private boolean canEatHomework;
    private Student dogOwner;

    public Dog(String dogName, String dogBreed, boolean canEatHomework, Student dogOwner) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.canEatHomework = canEatHomework;
        this.dogOwner = dogOwner;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isCanEatHomework() {
        return canEatHomework;
    }

    public void setCanEatHomework(boolean canEatHomework) {
        this.canEatHomework = canEatHomework;
    }

    public Student getDogOwner() {
        return dogOwner;
    }

    public void setDogOwner(Student dogOwner) {
        this.dogOwner = dogOwner;
    }
}
