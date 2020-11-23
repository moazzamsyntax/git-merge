package com.company;

public class Car {
    int doors;
    int engine;
    String color;
    String number;

    public Car(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name of car is:" + name);
    }

    public void setdoor(String door) {
        doors = door;
    }
    public void setenginecapacity(int enginec) {
        engine= enginec;
    }

    public int getdoors() {
        System.out.println("The number of doors is :" + doors);
        return doors;
    }

    public int getenginecapacity() {
        System.out.println("The engine capacity is :" + engine);
        return engine ;
    }

    public void setcolor(String colorc) {
        color =colorc;
    }

    public String getcolor() {
        System.out.println("The color of car is :" + color);
        return color;
    }

    public void setnumber (String numberc) {
        number =numberc;
    }

    public String getnumber() {
        System.out.println("The number of car is :" + number);
        return number;
    }
}