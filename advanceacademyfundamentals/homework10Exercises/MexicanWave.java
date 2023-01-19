package advanceacademyfundamentals.homework10Exercises;

public class MexicanWave {
    public static void main(String[] args) {
        String wave = "hello";
        String string[] = new String[wave.length()];

        for (int i = 0; i < wave.length(); i++) {
            char a1 = wave.charAt(i);
            char a2 = Character.toUpperCase(a1);
            if (i == 0)
                System.out.println(a2 + wave.substring(i + 1));
            else
                System.out.println(wave.substring(0, i) + a2 + wave.substring(i + 1));
        }

        char[] mexicanWave = "hello".toCharArray();
        for (int i = 0; i < mexicanWave.length; i++) {
            if (i - 1 >= 0) {
                mexicanWave[i - 1] = Character.toLowerCase(mexicanWave[i - 1]);
            }
            mexicanWave[i] = Character.toUpperCase(mexicanWave[i]);
            System.out.println(new String(mexicanWave));
        }
    }
}
