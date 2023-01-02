package advanceacademyoop.bakery.products;

import advanceacademyoop.bakery.Pastry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cookies extends Pastry {

    private Map<String, List<String>> cookiesRecipe;
    public Cookies() {

        List<String> cookiesIngredients = new ArrayList<>(super.getIngredients());
        cookiesIngredients.add("sugar");

        cookiesRecipe = new HashMap<>();
        cookiesRecipe.put("cookies", cookiesIngredients);
    }

    public Map<String, List<String>> getCookiesRecipe() {
        return cookiesRecipe;
    }
}
