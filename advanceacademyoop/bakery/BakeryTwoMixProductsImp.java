package advanceacademyoop.bakery;

import advanceacademyoop.bakery.products.Bread;
import advanceacademyoop.bakery.products.Cookies;
import advanceacademyoop.bakery.products.Pie;

public class BakeryTwoMixProductsImp implements MixProducts {

    @Override
    public Bread mixBread() {
        Bread breadWithGarlic = new Bread();
        breadWithGarlic.getBreadRecipe().get("bread").add("garlic");
        return breadWithGarlic;
    }

    @Override
    public Cookies mixCookies() {
        Cookies cookiesWithGarlic = new Cookies();
        cookiesWithGarlic.getCookiesRecipe().get("cookies").add("garlic");
        return cookiesWithGarlic;
    }

    @Override
    public Pie mixPie() {
        Pie pieWithGarlic = new Pie();
        pieWithGarlic.getPieRecipe().get("pie").add("garlic");
        return pieWithGarlic;
    }
}
