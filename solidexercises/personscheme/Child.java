package solidexercises.personscheme;

import java.util.List;
import java.util.Map;

public class Child extends Person {

    private String favoriteColor;

    public Child(String name, int age, Map<String, List<Street>> addresses, String favoriteColor) {
        super(name, age, addresses);
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    @Override
    void tellAddress(Person person) {
        System.out.println("I won't tell my address");
    }
}
