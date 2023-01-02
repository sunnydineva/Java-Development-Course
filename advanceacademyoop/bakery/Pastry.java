package advanceacademyoop.bakery;

import java.util.*;

public class Pastry {
    List<String> ingredients;

    public Pastry() {
        this.ingredients = new ArrayList<>(Arrays.asList("flour", "salt"));
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}



