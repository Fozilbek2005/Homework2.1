
        package com.company;

public class Son extends Father{

    public Son(String name, int age, Car car, EHight hight) {
        super(name, age, car, hight);
    }

    @Override
    public int method(int year, int age) {
        return year-age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}