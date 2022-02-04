package com.company;

public class Father extends Grandpa{

    public Father(String name, int age, Car car, EHight hight) {
        super(name, age, car, hight);
    }

    public int method(int year, int age){
        return year+age;
    }

    public static void method2(int year, int age){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}