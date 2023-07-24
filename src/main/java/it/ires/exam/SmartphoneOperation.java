package it.ires.exam;

public interface SmartphoneOperation {

    public void startCall(String destinationNumber);

    public void endCall();

    public void calcNumberOfCalls(String simNumber);

    public void totalMinutesOfCalls();

    public boolean canCall();


}
