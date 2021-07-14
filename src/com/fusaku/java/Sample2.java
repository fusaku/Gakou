package com.fusaku.java;

public class Sample2 {
    public static void main(String[] args){
        for (int i = 0; i < 6; i++){
            int number = (int) (Math.random()*(6-1)+1);
            System.out.println("nunber[" + i + "] ->" + number);
        }
    }
}
