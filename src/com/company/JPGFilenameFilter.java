package com.company.mar_14th;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {
fasndf,masndf,m    @Override
    public boolean accept(File file, String fileName) {
        if(fileName.endsWith(".jpg"))
            return true;
        return false;
    }
}
