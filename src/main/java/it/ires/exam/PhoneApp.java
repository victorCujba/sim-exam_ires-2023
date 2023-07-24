package it.ires.exam;


public class PhoneApp {

    public static void main(String[] args) {

        OperatorPlan planStandart = new OperatorPlan("Standard", 2);

        SimCard sim1 = new SimCard("+393284987028", planStandart, 50);


        System.out.println(sim1);
        System.out.println(SimCard.callsExecuted);

        Smartphone iPhone = new Smartphone(sim1);
        iPhone.startCall("124123");
        System.out.println(iPhone);


    }

}
