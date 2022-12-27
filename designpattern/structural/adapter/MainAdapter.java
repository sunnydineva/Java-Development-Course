package designpattern.structural.adapter;

import java.util.List;

public class MainAdapter {
    public static void main(String[] args) {

        Human human = new Human("Ivan", 31, "ivan@ivan.com");
        Fish fish = new Fish("Fishy", 2);

        ClientList clientList = new ClientList(human, fish);
        List<HumanInfoInterface> list = clientList.getStrageList();

        for(HumanInfoInterface element : list){
            System.out.println(element.getObjectName() + " " + element.getObjectAge() + " " + element.getObjectEmail());
        }


    }

}
