package it.ires.exam;

public class OperatorPlan {

    private final String name;

    private final int cost;

    public OperatorPlan(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }


    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + " , " + "Cost : " + cost + " €/min";
    }
}
