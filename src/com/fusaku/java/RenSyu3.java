package com.fusaku.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RenSyu3 {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        System.out.println("aの挿入位置を整数で入力してください。");
        int num = Integer.parseInt(br.readLine());
        sb.append(str);
        sb.insert(num,"a");
        System.out.println(sb.toString());
    }
}
