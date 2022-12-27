package advanceacademy.homework06;

public class LikesFacebookString {

        public static void main(String[] args) {
            String names [] = {"Viktor", "Sunny", "Ema", "Lora"};
            Likes(names);
        }
        // метод:
        public static void Likes (String names[] ) {
            if (names.length == 0) {
                System.out.println("There are no likes at this moment.");
            } else if (names.length == 1) {
                System.out.println(names[0] + " liked this");
            } else if (names.length == 2) {
                System.out.println(names[0] + " and " + names[1] + " liked this.");
            } else if (names.length == 3) {
                System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " liked this.");
            } else {
                System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others liked this.");

            }
        }
    }



