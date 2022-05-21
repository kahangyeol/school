package com.company.mar_21th;

import java.io.*;
import java.util.Scanner;

public class memo {
    static Scanner scanner;
    static String name;
    static int rank;
    static String content;
    static String path = "d:\\hangyeol\\text.txt";
    static File file = new File(path);

    public static void main(String[] args) {
        init();
        while (true) {
            menu();
        }
    }

    private static void init() {
        scanner = new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("      [메모장]");
        System.out.println("===============================");
        System.out.println("1.메모 쓰기");
        System.out.println("2.메모 읽기");
        System.out.println("3.메모 삭제");
        System.out.println("4.종료");
        System.out.println("===============================");
        System.out.println("선택: ");
        int menuSelect = scanner.nextInt();

        switch (menuSelect) {
            case 1:
                memoWrite();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("다시");
                break;
        }
    }

    private static void memoWrite() {
        String sCount = "";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        System.out.println("[메모 쓰기]");

        System.out.print("이름: ");
        name = scanner.next();
        System.out.print("중요도(1,2,3,...)");
        rank = scanner.nextInt();

        int count  = memoCount();
        if(count < 10){
            sCount = "0"+count;
        }else {
            sCount += count;
        }
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("카운트 " + sCount + ". 이름: " + name + " 중요도: " + rank + ".");
            bufferedWriter.newLine();


            System.out.print("내용");
            String temp = "";
            do {
                temp = scanner.nextLine();
                if (temp.equals("exit")) {
                    break;
                }
                bufferedWriter.write(temp);
                bufferedWriter.newLine();
            } while (true);
            bufferedWriter.write("=======================================");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void memoRead() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int memoCount() {
        int count = 0;
        String data;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);

            bufferedReader = new BufferedReader(fileReader);
            while ((data = bufferedReader.readLine()) != null) {
                if (data.equals("======================================="))
                    count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
