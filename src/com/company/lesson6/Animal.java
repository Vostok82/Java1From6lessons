package com.company.lesson6;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Animal name is " + name);
    }

    public String getName() {
        return name;
    }

    public void swim(int distance){
        System.out.println("Animal swim on distance " + distance);
    }

    public void run(int distance){
        System.out.println("Animal run on distance " + distance);
    }

}
