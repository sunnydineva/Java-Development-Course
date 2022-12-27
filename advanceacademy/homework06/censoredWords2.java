package advanceacademy.homework06;

public class censoredWords2 {
    //Трудна: Имаме работеща система (Социална мрежа) и следим в коментарите на потребителите дали се използват
    // вулгарни думи. Направете метод, който да приема само един параметър тип String
    // и принтира в конзолата същият String, но без гласните букви.
    // За тази задача можете свободно да използвате интернет и да разгледате решенията там.
    // Обсъдете помежду си, кое решение е най-добро и най-лесно. Пример:
    //"Hello, can you translate this message?" - "Hll, cn trnslt ths mssg?"

    public static void main(String[] args) {

        censoredWord("Hello, can you translate this message?");
    }

    public static void censoredWord(String inputWords) {
        //String vowels[] = {"a", "e", "i", "o", "u", "y"};
        //for (int i = 0; i < inputWords.length(); i++) {
            inputWords = inputWords.replace("a", "");
            inputWords = inputWords.replace("e", "");
            inputWords = inputWords.replace("i", "");
            inputWords = inputWords.replace("o", "");
            inputWords = inputWords.replace("u", "");

        //}
        System.out.println(inputWords);


    }
}
