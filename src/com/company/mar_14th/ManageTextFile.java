package com.company.mar_14th;
import java.io.*;

import static java.io.File.separator;
public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCount = 10;
        String fullPath = separator + "godofjava" + separator + "text" + separator + "number.txt";
        manager.writeFile(fullPath, numberCount);
        manager.readFile(fullPath);
    }

    private void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWrite = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWrite = new BufferedWriter(fileWriter);
            for (int loop = 0; loop <= numberCount; loop++) {
                bufferedWrite.write(Integer.toString(loop));
                bufferedWrite.newLine();
            }
            System.out.println("Write success !!!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bufferedWrite != null){
                try{
                    bufferedWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter != null){
                try{
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readFile(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if(fileReader != null){
                try{
                    fileReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }
}
