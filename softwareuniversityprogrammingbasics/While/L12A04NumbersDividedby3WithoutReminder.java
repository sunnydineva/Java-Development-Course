package softwareuniversityprogrammingbasics.While;

public class L12A04NumbersDividedby3WithoutReminder {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
