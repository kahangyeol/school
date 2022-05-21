package com.company.test11;

import java.util.LinkedList;
import java.util.Scanner;

public class Test_LinkedList {
    static LinkedList<Integer> grade;
    static Scanner scanner;
    public static void main(String[] args) {
        init();
        gradeInputOutput();
        zero();
    }

    private static void init() {
        grade = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public static void gradeInputOutput(){
        for(int i = 0; i <= 5; i++){
            System.out.print("성적을 입력하세요");
            int temp = scanner.nextInt();
            grade.add(temp);
        }
        System.out.println("\n");

        for(int i = 0; i <= 5; i++){
            System.out.println(i+"번째 성적은: " + grade.get(i));
        }
        System.out.println("\n");
    }

    public static void zero(){
        for(int i = 0; i < grade.size(); i++){
            if(i % 2 == 1){
                grade.set(i,0);
            }
        }

        System.out.println("변경한 성적은");
        for(int i = 0; i <= 5; i++){
            System.out.println(i+"번째 성적은: " + grade.get(i));
        }
    }


}
