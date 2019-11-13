package com.challenge.composition;

public class Bed {

    private String material;
    private double width;
    private double length;
    private int pillows;
    private int duvet;
    private boolean haveHeadboard;

    public Bed(String material, double width, double length, int pillows, int duvet, boolean haveHeadboard) {
        this.material = material;
        this.width = width;
        this.length = length;
        this.pillows = pillows;
        this.duvet = duvet;
        this.haveHeadboard = haveHeadboard;
    }

    public double getArea() {
        return width * length;
    }

    public String getMaterial() {
        return material;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getPillows() {
        return pillows;
    }

    public int getDuvet() {
        return duvet;
    }

    public boolean isHaveHeadboard() {
        return haveHeadboard;
    }
}
