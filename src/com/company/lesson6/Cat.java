package com.company.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 0 | distance > 200){
            distance = 200;
        }
        System.out.println("Cat " + getName() + " run " + distance + " metres");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat cannot swim");
    }
}
