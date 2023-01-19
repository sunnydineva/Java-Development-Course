package advanceacademyfundamentals.homework07Sort.TeachersAndStudents;

import java.util.ArrayList;

public class heathensHelper {
    public ArrayList<Heathen> heathens;

    public void getHeathens() {
        heathens = new ArrayList<>();

        Heathen h1 = new Sister("Sunny", "Dineva", "sd@gmail.com", "0899044806", 5000, heathensHelper.getSister1Classes());
        Heathen h2 = new Brother("Moony", "Mineva", "mm@gmail.com", "0899044807", "G1", 123, heathensHelper.gradesStudent1);
        Heathen h3 = new Sister("Neptunium", "Mileva", "nm@gmail.com", "0899044808", 4000, heathensHelper.getSister2Classes());
        Heathen h4 = new Brother("Pluto", "Lencheva", "pl@gmail.com", "0899044809", "A1", 233, heathensHelper.gradesStudent1);
        Heathen h5 = new Sister("Mluto", "Pencheva", "mp@gmail.com", "0899044810", 3000, heathensHelper.getSister3Classes());
        Heathen h6 = new Sister("Brumburutus", "Dragieva", "bd@gmail.com", "0899044816", 2000, heathensHelper.getSister4Classes());
        Heathen h7 = new Sister("Lollipop", "Rakieva", "lr@gmail.com", "0899044826", 1000, heathensHelper.getSister5Classes());

        heathens.add(h1);
        heathens.add(h2);
        heathens.add(h3);
        heathens.add(h4);
        heathens.add(h5);
        heathens.add(h6);
        heathens.add(h7);
    }

    public static ArrayList<String> getSister1Classes() {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("A1");
        groups.add("B1");
        groups.add("C1");
        return groups;

    }
    public static ArrayList<String> getSister2Classes() {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("D1");
        groups.add("E1");
        groups.add("F1");
        return groups;
    }
    public static ArrayList<String> getSister3Classes() {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("G1");
        groups.add("H1");
        return groups;
    }
    public static ArrayList<String> getSister4Classes() {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("I1");
        groups.add("J1");
        return groups;
    }
    public static ArrayList<String> getSister5Classes() {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("k1");
        groups.add("L1");
        return groups;
    }

    public static double gradesStudent1 [] = {2,4,6};

    public static double gradesStudent2 [] = {5,6,6};

}
