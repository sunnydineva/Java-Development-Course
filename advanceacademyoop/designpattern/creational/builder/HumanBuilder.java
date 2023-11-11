package advanceacademyoop.designpattern.creational.builder;

public class HumanBuilder {

    private String firstName;
    private String lastName;
    private Integer age;
    private String job;

    public HumanBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public HumanBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public HumanBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public HumanBuilder job(String job) {
        this.job = job;
        return this;
    }

    public Human build(){
        return new Human(this.firstName, this.lastName, this.age, this.job);
    }
}
