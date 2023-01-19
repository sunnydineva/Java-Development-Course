package advanceacademyfundamentals.homework10Exercises;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public double raiseSalary(int percent) {
        double result = salary + salary * percent /100;
        return result;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", salary=" + salary +
                ']';
    }
}
