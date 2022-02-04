package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Father father = new Father("name", 12, car, EHight.MEDIUM);

        Son son = new Son("name2", 1, car, EHight.SHORT);
        Son son2 = new Son("name3", 3, car, EHight.SHORT);

        System.out.println(father);
        System.out.println(son);
        System.out.println(son2);

        father.method(2021, 12);
        son.method(2021, 1);
        son2.method(2021, 2);
    }

}