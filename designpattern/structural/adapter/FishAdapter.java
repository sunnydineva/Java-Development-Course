package designpattern.structural.adapter;

public class FishAdapter implements HumanInfoInterface{

    private Fish fish;

    public FishAdapter(Fish fish) {
        this.fish = fish;
    }

    @Override
    public String getObjectName() {
        return fish.getFishName();
    }

    @Override
    public Integer getObjectAge() {
        return fish.getFishAge();
    }

    @Override
    public String getObjectEmail() {
        return null;
    }
}
