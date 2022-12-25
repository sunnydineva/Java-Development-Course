package bakery;

import java.util.List;
import java.util.Map;

public class PastryInterfaceBakeryOneImpl implements PastryInterface{

  @Override
    public void cookBread(Map<String, List<String>> pastry) {
        Bread bread = new Bread(pastry);
    }


    @Override
    public void cookCookies(Map<String, List<String>> pastry) {
       Cookies cookies = new Cookies(pastry);
    }

    @Override
    public void cookPie(Map<String, List<String>> pastry) {
        Pie pie = new Pie(pastry);
    }

    @Override
    public void printIngredients(Pastry pastry) {

    }


}
