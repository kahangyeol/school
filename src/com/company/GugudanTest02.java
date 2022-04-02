package com.company;

import java.util.Scanner;

public class GugudanTest02 {
    static int gugudan;
    static int gugudanCount;
    static Scanner scanner;
    public static void main(String[] args) {
        init();
        result();
        scanner.close();
    }

    public static void init(){
        scanner = new Scanner(System.in);
        System.out.print("몇단: ");
        gugudan = scanner.nextInt();

        System.out.print("몇까지: ");
        gugudanCount = scanner.nextInt();
    }

    public static void result(){
        for(int i = 1; i <= gugudanCount; i++){
            System.out.println(gugudan + "X" + i + "=" + gugudan*i);
        }
    }
}
