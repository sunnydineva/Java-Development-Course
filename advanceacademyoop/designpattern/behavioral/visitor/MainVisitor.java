package advanceacademyoop.designpattern.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {

        Client bank = new Bank("MyBank", "bank addr", 3);

        Client shop = new Shop("MySHop", "shop addr", 159);

        Client restaurant = new Restaurant("MyRestaurant", "restaurant addr", true);

        AdMsgVisitor adMsgVisitor = new AdMsgVisitor();
        List<Client> clients = Arrays.asList(bank, shop, restaurant);
        adMsgVisitor.sendAdMsg(clients);
    }
}
