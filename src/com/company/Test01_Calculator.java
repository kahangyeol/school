package com.company;

import java.util.Scanner;

public class Test01_Calculator {
    static Scanner scanner;
    static int num1;
    static int num2;
    static String operator;

    public static void main(String[] args) {
        init();
        switch (operator){
            case "+":
                sum(num1,num2);
                break;
            case "-":
                min(num1,num2);
                break;
            case "*":
                mok(num1,num2);
                break;
            case "/":
                div(num1,num2);
                break;
        }
        scanner.close();
    }

    public static void init(){
        scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        num1 = scanner.nextInt();

        System.out.print("(+,-,/.*) 연산자: ");
        operator = scanner.next();

        System.out.print("두번째 숫자: ");
        num2 = scanner.nextInt();
    }

    public static void sum(int num1, int num2){
        System.out.println("결과: " + (num1 + num2));
    }
    public static void mok(int num1, int num2){
        System.out.println("결과: " + (num1 * num2));
    }
    public static void min(int num1, int num2){
        System.out.println("결과: " + (num1 - num2));
    }
    public static void div(int num1, int num2){
        System.out.println("결과: " + (num1 / num2));
    }
}
