package com.fusaku.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RenSyu2 {
    public static void main(String[] args) throws IOException{
        System.out.println("文字列を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.print(str);

        StringBuilder str1 = new StringBuilder(str);
        str = str1.reverse().toString();

        System.out.println("を逆順にすると" + str1 + "です。");
    }
}
