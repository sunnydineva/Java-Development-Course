package advanceacademyoop.bakery.products;

import advanceacademyoop.bakery.Pastry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pie extends Pastry {

    private Map<String, List<String>> pieRecipe;

    public Pie() {

        List<String> pieIngredients = new ArrayList<>(super.getIngredients());
        pieIngredients.add("whiteCheese");
        pieIngredients.add("eggs");

        pieRecipe = new HashMap<>();
        pieRecipe.put("pie", pieIngredients);
    }

    public Map<String, List<String>> getPieRecipe() {
        return pieRecipe;
    }

    public void setPieRecipe(Map<String, List<String>> pieRecipe) {
        this.pieRecipe = pieRecipe;
    }
}
