package designpattern.structural.adapter;

public class Human implements HumanInfoInterface{

    private String humanName;
    private Integer humanAge;
    private String email;

    public Human(String name, Integer age, String email) {
        this.humanName = name;
        this.humanAge = age;
        this.email = email;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public Integer getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Integer humanAge) {
        this.humanAge = humanAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getObjectName() {
        return this.humanName;
    }

    @Override
    public Integer getObjectAge() {
        return this.humanAge;
    }

    @Override
    public String getObjectEmail() {
        return this.email;
    }
}
