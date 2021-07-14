package com.fusaku.java;

import java.util.Currency;

class Car{
    private int num;
    private double gas;
    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    public void show(){
        System.out.println("車のナンバーは" + num +"で、" + "ガソリン量は" + "です。");
    }
}

class RacingCar extends Car{
    private int course;
    public void setCourse(int c){
        course = c;
        System.out.println("コース番号を" + course + "にしました。");
    }
    public void show(){
        System.out.println("コース番号は" + course + "です。");
    }
}
public class Sample3 {
    public static void main(String[] args){
        Car car1 = new RacingCar();
        car1.setCar(1234,20.5);
        ((RacingCar)car1).setCourse(5);
        car1.show();
    }
}
