package com.company.test11;

import java.util.HashMap;

public class CheckMap {
    public static void main(String[] args) {
        CheckHashMap();
    }

    public static void CheckHashMap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
    }
}
