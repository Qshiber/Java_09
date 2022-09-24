package com.sda.javaoop.pen;

import java.util.Objects;

public class Pen {

    private String make;
    private int length;
    private String color;
    private double size;

    public Pen() {

    }

    public Pen(String make, int length, String color, double size) {
        this.make = make;
        this.length = length;
        this.color = color;
        this.size = size;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void copyPen(Pen p) {
        this.make = p.make;
        this.size = p.size;
        this.color = p.color;
        this.length = p.length;
    }

    public Pen(Pen p) {
        this.make = p.make;
        this.size = p.size;
        this.color = p.color;
        this.length = p.length;
    }

    public static Pen copyBox(Pen pen) {
        return new Pen();
    }

    @Override
    public String toString() {
        return "Pen{" +
                "make='" + make + '\'' +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
