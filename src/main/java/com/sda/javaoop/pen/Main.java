package com.sda.javaoop.pen;

public class Main {

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen("Still", 20, "Red", 0.7);

        System.out.println(pen1.toString());
        System.out.println(pen2.toString());

        Pen pen3 = new Pen();
        System.out.println("Is Pen 3 equal to pen 2: " + pen3.equals(pen2));
        pen3.copyPen(pen2);
        System.out.println("Pen3: " + pen3);
        System.out.println("Is Pen 3 equal to pen 2: " + pen3.equals(pen2));
        System.out.println("Pen2 hashcode: " + pen2.hashCode());



    }
}
