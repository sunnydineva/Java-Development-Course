package advanceacademyoop.designpattern.behavioral.visitor;

import java.util.List;

public class AdMsgVisitor implements Visitor{

    public void sendAdMsg(List<Client> clients){
        for(Client client : clients){
            client.accept(this);
        }
    }
    @Override
    public void visitBank() {
        System.out.println("Great location for your next branch");
    }

    @Override
    public void visitShop() {
        System.out.println("New chocolates are available");
    }

    @Override
    public void visitRestaurant() {
        System.out.println("In order to be successful collaborate with Bar Zanzibar");
    }
}
