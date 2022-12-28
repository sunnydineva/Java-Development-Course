package advanceacademyoop.bakery;

import java.util.*;

public class Pastry {
    List<String> ingredients;

    public Pastry() {
        this.ingredients = new ArrayList<>(Arrays.asList("flour", "salt"));
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    /* private List<String> pastryIngredients;

    public Pastry(List<String> pastryIngredients) {
        this.pastryIngredients = pastryIngredients;
    }

    public List<String> getPastryIngredients() {
        return new ArrayList<>(Arrays.asList("flour", "salt"));
    }

    public void setPastryIngredients(List<String> pastryIngredients) {
        this.pastryIngredients = pastryIngredients;
    }

     */
}



