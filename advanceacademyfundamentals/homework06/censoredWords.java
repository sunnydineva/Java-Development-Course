package advanceacademyfundamentals.homework06;

public class censoredWords {
    //Трудна: Имаме работеща система (Социална мрежа) и следим в коментарите на потребителите дали се използват
    // вулгарни думи. Направете метод, който да приема само един параметър тип String
    // и принтира в конзолата същият String, но без гласните букви.
    // За тази задача можете свободно да използвате интернет и да разгледате решенията там.
    // Обсъдете помежду си, кое решение е най-добро и най-лесно. Пример:
    //"Hello, can you translate this message?" - "Hll, cn trnslt ths mssg?"

    public static void main(String[] args) {
        censoredWord("Liam");
    }

    public static void censoredWord(String inputWords) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < inputWords.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (inputWords.charAt(i) == vowels[j]) {
                    System.out.println("i want to remove the char but i can only change it");

                    inputWords = inputWords.replace(inputWords.charAt(i), '*');

                }

            }

        }
        System.out.println(inputWords);
    }
}
