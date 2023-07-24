package it.ires.exam;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Smartphone implements SmartphoneOperation {
    private SimCard simCard;

    private LocalTime startCall;
    private LocalTime endCall;

    int timeOfCalling;
    int totalCallingTime;

    public Map<String, Integer> calls;


    public Smartphone(SimCard simCard) {
        this.simCard = simCard;
        calls = new HashMap<>();
    }

    @Override
    public void startCall(String destinationNumber) {
        startCall = LocalTime.now();
        calls.put(destinationNumber, timeOfCalling);

    }

    @Override
    public void endCall() {
        endCall = LocalTime.now();

    }

    public void totalMinutesOfCalls() {
        timeOfCalling = (endCall.getMinute() - startCall.getMinute());
        totalCallingTime += timeOfCalling;
    }

    @Override
    public void calcNumberOfCalls(String simNumber) {
    }


    @Override
    public boolean canCall() {
        return true;
    }


}
