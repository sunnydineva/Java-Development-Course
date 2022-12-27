package advanceacademy.homework06;

public class censoredWords3 {
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
        inputWords = inputWords.replaceAll("[a, e, i, o, u, y, A, E, I, O, U, Y]", "*");
        System.out.println(inputWords);
    }
}
