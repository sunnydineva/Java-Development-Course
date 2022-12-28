package advanceacademyoop.bakery;

import advanceacademyoop.bakery.products.Bread;
import advanceacademyoop.bakery.products.Cookies;
import advanceacademyoop.bakery.products.Pie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BakeryOneImpl implements Bake {

    @Override
    public void bakeAndprintRecipe(Pastry pastry) {

        Map<String, List<String>> map = new HashMap<>();

        if (pastry instanceof Bread) {
            map = (((Bread) pastry).getBreadRecipe());
        } else if (pastry instanceof Cookies) {
            map = (((Cookies) pastry).getCookiesRecipe());
        } else if (pastry instanceof Pie) {
            map = (((Pie) pastry).getPieRecipe());
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            String title = entry.getKey().toUpperCase();
            System.out.println(title);

            List<String> ingredients = entry.getValue();

            for (int i = 0; i < ingredients.size(); i++) {
                String ingredient = ingredients.get(i);
                if (i == ingredients.size() - 1) {
                    System.out.println(ingredient + ".");
                } else {
                    System.out.print(ingredient + ", ");
                }
            }
        }
    }
}

