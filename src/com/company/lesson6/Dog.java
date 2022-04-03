package com.company.lesson6;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        if (distance < 0 | distance > 500){
            distance = 500;
        }
        System.out.println("Dog " + getName() + " run " + distance + " metres");
    }

    @Override
    public void swim(int distance) {
        if (distance < 0 | distance > 10){
            distance = 10;
        }
        System.out.println("Dog " + getName() + " swim " + distance + " metres");
    }
}
