package com.company;

import java.util.Scanner;

public class AppendTest05 {
    static Scanner scanner;
    static String first;
    static String second;

    public static void main(String[] args) {
        init();
        append();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        System.out.print("첫번째 문자열: ");
        first = scanner.nextLine();

        System.out.print("두번째 문자열: ");
        second = scanner.nextLine();
    }

    public static void append() {
        System.out.println("결과" + first + second);
    }
}
