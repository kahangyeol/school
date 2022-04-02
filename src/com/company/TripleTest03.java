package com.company;

import java.util.Scanner;

public class TripleTest03 {
    static Scanner scanner;
    static int num1;
    static int num2;
    static int num3;
    static int sum;

    public static void main(String[] args) {
        init();
        sum = fSum();
        avg(sum);
        scanner.close();
    }

    public static void init(){
        scanner = new Scanner(System.in);
        System.out.print("첫번째: ");
        num1 = scanner.nextInt();

        System.out.print("두번째: ");
        num2 = scanner.nextInt();

        System.out.print("세번째: ");
        num3 = scanner.nextInt();
    }

    public static int fSum(){
        int sum = num1+num2+num3;
        System.out.println("합계: " + sum);
        return sum;
    }

    public static void avg(int sum){
        System.out.println("평균: " + sum / 3);
    }

}
