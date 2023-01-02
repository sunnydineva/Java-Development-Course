package advanceacademyoop.bakery.products;

import advanceacademyoop.bakery.Pastry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bread extends Pastry {

    private Map<String, List<String>> breadRecipe;
    public Bread() {

        List<String> breadIngredients = new ArrayList<>(super.getIngredients());
        breadIngredients.add("oil");
        breadIngredients.add("gluten");

        breadRecipe = new HashMap<>();
        breadRecipe.put("bread", breadIngredients);
    }

    public Map<String, List<String>> getBreadRecipe() {
        return breadRecipe;
    }
}
