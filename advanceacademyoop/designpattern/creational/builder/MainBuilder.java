package advanceacademyoop.designpattern.creational.builder;

public class MainBuilder {

    public static void main(String[] args) {
    /*
        HumanBuilder builder = new HumanBuilder();
        builder.firstName("Pesho");
        builder.lastName("Petrov");
        builder.age(78);
        builder.job("artist");
        Human h8 = builder.build();
     */

        Human h8 = new HumanBuilder()
                .firstName("Vasil")
                .build();

        Human h9 = new HumanBuilder()
                .firstName("Sasho")
                .lastName("Hristov")
                .build();

        Human h10 = new HumanBuilder()
                .firstName("Dora")
                .lastName("Venkova")
                .age(18)
                .build();

        Human h11 = new HumanBuilder()
                .firstName("Boro")
                .lastName("Petrov")
                .age(21)
                .job("developer")
                .build();
    }
}
