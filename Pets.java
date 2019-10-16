package com.company;

public class Pets {

    public Pets() {
    }

    public Pets(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void voice() {
        System.out.println("I say something!");
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public String getName() {
        return name;
    }

}

class Dogs extends Pets {
    Dogs() {
    }

    Dogs(String n, int a, String p) {
        super(n, a);
        this.place = p;
    }

    private String place;

    public void from() {
        System.out.println("From: " + place);
    }

    public void voice() {
        System.out.println("Hav-Hav!");
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.getName());
    }


}

class Cat extends Pets {
    Cat() {
    }

    Cat(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Meow-meow!");
    }

}