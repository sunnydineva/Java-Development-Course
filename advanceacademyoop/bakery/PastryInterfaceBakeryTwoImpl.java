package advanceacademyoop.bakery;

import java.util.List;
import java.util.Map;

public class PastryInterfaceBakeryTwoImpl implements PastryInterface{
    @Override
    public void cookBread(Map<String, List<String>> pastry) {

    }

    @Override
    public void cookCookies(Map<String, List<String>> pastry) {

    }

    @Override
    public void cookPie(Map<String, List<String>> pastry) {

    }

    @Override
    public void printIngredients(Pastry pastry) {

    }
/*
    public void addGarlic(List<String> ingredients){
        ingredients.add("garlic");
    }
  @Override
    public void cookBread(String pastryName, List<String> ingredients) {
        addGarlic(ingredients);
        Bread bread = new Bread(pastryName, ingredients);
    }


    @Override
    public void cookCookies(String pastryName, List<String> ingredients) {
       addGarlic(ingredients);
       Cookies cookies = new Cookies(pastryName, ingredients);
    }

    @Override
    public void cookPie(String pastryName, List<String> ingredients) {
        addGarlic(ingredients);
        Pie pie = new Pie(pastryName, ingredients);
    }

 */
}
