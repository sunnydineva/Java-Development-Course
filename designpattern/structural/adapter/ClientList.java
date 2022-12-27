package designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class ClientList {

    private Human human;
    private Fish fish;

    public ClientList(Human human, Fish fish) {
        this.human = human;
        this.fish = fish;
    }

    public List<HumanInfoInterface> getStrageList(){
        List<HumanInfoInterface> result = new ArrayList<>();
        result.add(human);

        HumanInfoInterface adaptedFish = new FishAdapter(fish);
        result.add(adaptedFish);
        return result;
    }
}
