package advanceacademyoop.bakery;

public class MainBakery {
    public static void main(String[] args) {

        MixProducts mixProductsOne = new BakeryOneMixProductsImpl();
        Bake bakeryOne = new BakeryOneImpl();

        bakeryOne.bakeAndprintRecipe(mixProductsOne.mixBread());
        System.out.println("-----------------------------------------------");
        bakeryOne.bakeAndprintRecipe( mixProductsOne.mixCookies());
        System.out.println("-----------------------------------------------");
        bakeryOne.bakeAndprintRecipe( mixProductsOne.mixPie());
        System.out.println("-----------------------------------------------");

        MixProducts mixProductsBakeryTwo = new BakeryTwoMixProductsImp();
        Bake bakeryTwo = new BakeryTwoImpl();

        bakeryTwo.bakeAndprintRecipe(mixProductsBakeryTwo.mixBread());
        System.out.println("-----------------------------------------------");
        bakeryTwo.bakeAndprintRecipe( mixProductsBakeryTwo.mixCookies());
        System.out.println("-----------------------------------------------");
        bakeryTwo.bakeAndprintRecipe( mixProductsBakeryTwo.mixPie());
        System.out.println("-----------------------------------------------");
    }
}
