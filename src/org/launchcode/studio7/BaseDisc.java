package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private String rate;

    public BaseDisc(String aRate) {
        this.rate = aRate;
    }
    public void spinDisc() {
        System.out.println("Disc is spinning at rate of " + rate + " rpm");
    }
    public void stopDisc() {
        System.out.println("Disc has successfully stopped");
    }
}
