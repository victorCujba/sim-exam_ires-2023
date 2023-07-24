package it.ires.exam;

import java.util.HashMap;
import java.util.Map;

public class SimCard {

    protected final String phoneNumber;

    protected final int credit;
    public Map<String, Integer> call = new HashMap<>();


    protected OperatorPlan plan;

    public void makeCall(String phoneNumber, int callTime) {
        call.put(phoneNumber, callTime);

    }


    public SimCard(String phoneNumber, OperatorPlan plan, int credit) {
        this.phoneNumber = phoneNumber;
        this.credit = credit;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "SimCard :" + "\n" +
                "Phone number : " + phoneNumber + '\'' + "\n" +
                "Credit : " + credit + "\n" +
                "Calls : " + call + "\n" +
                "Plan : " + plan + "\n";
    }





    /*public  Map<String, Integer> getCall() {
        for(Map.Entry<String,Integer> call : call.entrySet()){
             System.out.printf("Called Phone: %s \n Time of call: %s \n", call.getKey(), call.getValue());
        }

        return null;
    }

     */
}
