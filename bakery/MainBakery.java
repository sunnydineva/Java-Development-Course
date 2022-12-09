package bakery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBakery {
    public static void main(String[] args) {

        List<String> breadIngredients = new ArrayList<>(Arrays.asList("flour", "salt", "oil", "gluten"));
        List<String> cookiesIngredients = new ArrayList<>(Arrays.asList("salt", "sugar", "flour"));
        List<String> pieIngredients = new ArrayList<>(Arrays.asList("eggs", "flour", "whiteCheese", "salt"));

        Pastry bread = new Pastry("bread", breadIngredients);
        Pastry cookies = new Pastry("cookies", cookiesIngredients);
        Pastry pie = new Pastry("pie", pieIngredients);

        PastryInterface pastryInterface = new PastryInterfaceImpl();

        System.out.println("First bakery: " + pastryInterface.cook(bread));
        System.out.println("First bakery: " + pastryInterface.cook(cookies));
        System.out.println("First bakery: " + pastryInterface.cook(pie));

        List<String> breadIngredientGarlic = pastryInterface.addGarlic(breadIngredients);
        List<String> cookiesIngredientGarlic = (pastryInterface.addGarlic(cookiesIngredients));
        List<String> pieIngredientGarlic = (pastryInterface.addGarlic(pieIngredients));

        Pastry breadGarlic = new Pastry("bread", breadIngredientGarlic);
        Pastry cookiesGarlic = new Pastry("cookies", cookiesIngredientGarlic);
        Pastry pieGarlic = new Pastry("pie", pieIngredientGarlic);
        System.out.println("Second bakery: " + pastryInterface.cook(breadGarlic));
        System.out.println("Second bakery: " + pastryInterface.cook(cookiesGarlic));
        System.out.println("Second bakery: " + pastryInterface.cook(pieGarlic));
    }
}
