package com.challenge.composition;

public class Lamp {

    private boolean isPowered;
    private int voltage;

    public Lamp(boolean isPowered, int voltage) {
        this.isPowered = isPowered;
        this.voltage = voltage;
    }

    public void turnOnTurnOffLight() {
        if (isPowered) {
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }

    public boolean isPowered() {
        return isPowered;
    }

    public int getVoltage() {
        return voltage;
    }
}
