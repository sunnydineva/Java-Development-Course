package bakery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PastryInterfaceImpl implements PastryInterface{

    @Override
    public Map<String, List<String>> cook (Pastry pastryName) {
        Map<String, List<String>> result = new HashMap<>();
        result.put(pastryName.getPastryName(), pastryName.getIngredients());
        return result;
    }

    @Override
    public List<String> addGarlic(List<String> ingredients) {
        ingredients.add("garlic");
        return ingredients;
    }

}
