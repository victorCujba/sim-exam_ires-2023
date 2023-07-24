package it.ires.exam;


public class PhoneApp {

    public static void main(String[] args) {

        OperatorPlan planStandart = new OperatorPlan("Standard", 2);

        SimCard sim1 = new SimCard("+393284987028", planStandart, 50);

        sim1.makeCall("1234123123", 10);
        sim1.makeCall("124123 ", 12);

        System.out.println(sim1);

        //OperatorPlan plan = new OperatorPlan("standard", 15, 15);
        //SimCard sim = new SimCard("+39 123 4567 890", plan, 100);
    }

}
