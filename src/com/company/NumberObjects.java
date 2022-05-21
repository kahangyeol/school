package com.company;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects sample = new NumberObjects();

        sample.parseLong("r1024");
        sample.parseLong("1024");
        sample.printOtherBase(1024);
    }

    private long parseLong(String data) {
        long retLong = -1;
        try{
            retLong = Long.parseLong(data);
            System.out.println(retLong);
        }catch (NumberFormatException ne){
            System.out.println(data + " is not a number.");
        }catch (Exception e){

        }
        return retLong;
    }

    private void printOtherBase(long value) {
        System.out.println("Original: "+value);
        System.out.println("Binary  : "+Long.toBinaryString(value));
        System.out.println("HexL    : "+Long.toHexString(value));
        System.out.println("Octal   : "+Long.toOctalString(value));
    }
}
