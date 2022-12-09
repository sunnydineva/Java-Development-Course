package bakery;

import java.util.List;
import java.util.Map;

public interface PastryInterface {

    Map<String, List<String>> cook (Pastry pastryName);

    List<String> addGarlic(List<String> ingredients);

}


