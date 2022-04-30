package com.company.test11;

class Kind{
    String kind;
    String color;
    String modelName;
    String oil;
    int price;

    Kind(String kind,String color, String modelName, String oil, int price){
        this.kind = kind;
        this.color = color;
        this.modelName = modelName;
        this.oil = oil;
        this.price = price;
    }

}


public class Test11_parent extends Kind{

    Test11_parent(String kind, String color, String modelName, String oil, int price) {

        super(kind, color, modelName, oil, price);
    }
}
