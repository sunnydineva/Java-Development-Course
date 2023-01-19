package advanceacademyfundamentals.homework06;

import advanceacademyfundamentals.User3;

import java.util.ArrayList;

public class LikesFacebookArrayList2 {
    public ArrayList<User3> clients;

    // public void getClients () {
    public static ArrayList<User3> getClients() {
        ArrayList<User3> clients = new ArrayList<>();

        User3 a = new User3("Viktor", "Todorov");
        User3 b = new User3("Sunny", "Dineva");
        User3 c = new User3("Ema", "Todorov");
        User3 d = new User3("Viktor", "Ivanov");
        User3 e = new User3("Lili", "Ivanov");
        User3 f = new User3("Fifth", "Ivanov");

        clients.add(a);
        clients.add(b);
        clients.add(c);
        clients.add(d);
        clients.add(e);
        clients.add(f);

        return clients;

    }

    public static boolean isUsernameCorrect(String username) {
        if (username.length() < 8) {
            return false;
        }
        return true;
    }

    public static class LikesFacebookArrayList {

        //Сигурно сте наясно как работи "Like" системата на Facebook.
        // Хората могат да харесват публикации, снимки и други.
        // Ние искаме да направим текста, който се показва, когато харесаме дадена публикация.
        // Напишите функция "likes", която приема масив с имена и връща текст, който съответно е:
        //Ако в масива няма имена -> "no one likes this"
        //Ако в масива има 1 име пример "Ani" -> "Ani likes this"
        //Ако в масива има 2 имена -> "Ani and Viktor like this"
        //Ако в масива има 3 имена -> "Ani, Viktor and John like this"
        //Aко в масива има повече от 3 имена -> "Ani, Viktor and 4 others like this" (като пример ако има 10 имена, се изписват първите 2 имена и след това бройката на останалите "Ani, Viktor and 8 others like this")

        public static void main(String[] args) {
            //DataBase dataBase = new DataBase(); //създаваме класа
            //dataBase.getClients();
            // викаме метода и той връще ArrayLIst, трябва да го запаметим в променлива или в обект,
            // затова правим ArrayList
            ArrayList<User3> clients = getClients();
            Likes(getClients());
        }

        public static void Likes(ArrayList<User3> clients) {
            if (clients.size() == 0) {
                System.out.println("There are no likes at this moment.");
            } else if (clients.size() == 1) {
                System.out.println(clients.get(0) + " liked this");
            } else if (clients.size() == 2) {
                System.out.println(clients.get(0) + " and " + clients.get(1) + " liked this.");
            } else if (clients.size() == 3) {
                System.out.println(clients.get(0) + ", " + clients.get(1) + " and " + clients.get(2) + " liked this.");
            } else {
                System.out.println(clients.get(clients.size() - 1) + ", " + clients.get(1) + " and " + (clients.size() - 2) + " other liked this.");
            }
        }
    }
}
