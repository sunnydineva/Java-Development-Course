package advanceacademyoop.bakery;

import java.util.List;
import java.util.Map;

public interface PastryInterface {
     void cookBread(Map<String, List<String>> pastry);
     void cookCookies(Map<String, List<String>> pastry);
     void cookPie(Map<String, List<String>> pastry);
     void printIngredients(Pastry pastry);

}


