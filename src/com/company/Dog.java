package com.company;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("wuf");
    }

    @Override
    public void showMood() {
        System.out.println("wag");
    }
}
