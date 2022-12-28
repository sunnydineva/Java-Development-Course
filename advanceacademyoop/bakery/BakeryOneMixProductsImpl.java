package advanceacademyoop.bakery;

import advanceacademyoop.bakery.products.Bread;
import advanceacademyoop.bakery.products.Cookies;
import advanceacademyoop.bakery.products.Pie;

public class BakeryOneMixProductsImpl implements MixProducts {
    @Override
    public Bread mixBread() {
        return new Bread();
    }

    @Override
    public Cookies mixCookies() {
        return new Cookies();
    }

    @Override
    public Pie mixPie() {
        return new Pie();
    }
}

