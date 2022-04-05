package com.company;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("miaow");
    }

    @Override
    public void showMood() {
        System.out.println("purs");
    }
}
