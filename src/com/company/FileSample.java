package com.company.mar_14th;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "C:";
        sample.check(pathName);

    }

    private void check(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + "is exit? = " + file.exists()) ;
    }

}
