package com.company;

import java.util.Scanner;

public class Main {
    static int count;
    static int[] num;
    static Scanner scanner;

    public static void main(String[] args) {

        init();
        countNum(num);
        evenOdd(count);
        scanner.close();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        System.out.print("입력할 정수 갯수: ");
        count = scanner.nextInt();
        num = new int[count];
    }

    public static void countNum(int num[]) {
        for (int i = 0; i < count; i++) {
            System.out.print("입력할 정수: ");
            num[i] = scanner.nextInt();
        }
    }

    public static void evenOdd(int count) {
        String even = "";
        String odd = "";
        for (int i = 0; i < count; i++) {
            if (num[i] % 2 == 0)
                even += Integer.toString(num[i]) + " ";
            else
                odd += Integer.toString(num[i]) + " ";
        }
        if (even == null)
            even = "없음";

        if (odd == null)
            odd = "없음";

        System.out.println("짝수: " + even);
        System.out.println("홀수: " + odd);
    }

}
