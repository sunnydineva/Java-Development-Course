package softwareuniversityprogrammingbasics.ForLoop;

public class AdvanceForLOop {
    public static void main(String[] args) {
        printEvenSum(100);
    }
    public static void printEvenSum (int limit){
        int sumEven = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println(sumEven);
    }
}
