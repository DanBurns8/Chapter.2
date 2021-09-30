package com.company;

public class Box {
    //class attributes
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid;

    public Box(double h, double w, double l, String c, boolean lid) {
        height = h;
        width = w;
        length = l;
        color = c;
        hasALid = lid;
    }

    public Box(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
        color = "white";
        hasALid = true;
    }

    public Box() {    //default constructor
        height = 1.0;
        width = 1.0;
        length = 1.0;
        color = "white";
        hasALid = false;
    }

    //accessor methods
    public void setHeight(double h) {
        if (h > 0) {      //not doing "if's" yet
            height = h;
        }
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return length * width * height;
    }

    public String toString() {
        String s = "A box with dimension " + height + " " + width + " " + length;
        s += " It's color is " + color + " and it has a lid? " + hasALid;
        return s;
    }

    public static void main(String[] args){
        Box b1=new Box(5.4, 3, 7, "red", false);
        Box b2=new Box(4.5, 3.7, 7.8);
        Box b3=new Box();

        System.out.println(b1.getHeight());
        b1.setHeight(-37.0);
        System.out.println(b1.getHeight());
        System.out.println(b1.volume() + " " + b2.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());

        int x=5;
        String name="Betty Boop";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);
    }
}
