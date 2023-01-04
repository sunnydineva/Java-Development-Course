package advanceacademyoop.homeworksanddogs;

public class Dog {
    private String name;
    private String breed;
    private Student owner;
    public Dog(String dogName, String dogBreed, Student dogOwner) {
        this.name = dogName;
        this.breed = dogBreed;
        this.owner = dogOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public void confess(){
        System.out.println("Bow-wow! It was me - " + getName() + "." +
                " I ate the "+ this.owner.getName() + "'s homework" + ".");
    }
}
