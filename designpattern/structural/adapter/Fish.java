package designpattern.structural.adapter;

public class Fish implements FishInfoInterface{

    private String fishName;
    private Integer fishAge;

    public Fish(String fishName, Integer fishAge) {
        this.fishName = fishName;
        this.fishAge = fishAge;
    }

    @Override
    public String getFishName() {
        return this.fishName;
    }

    @Override
    public Integer getFishAge() {
        return this.fishAge;
    }
}
