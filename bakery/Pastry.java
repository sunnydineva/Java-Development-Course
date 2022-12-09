package bakery;

import java.util.List;

public class Pastry {
    private String pastryName;
    private List<String> ingredients;

    public Pastry(String pastryName, List<String> ingredients) {
        this.pastryName = pastryName;
        this.ingredients = ingredients;
    }

    public String getPastryName() {
        return pastryName;
    }

    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
