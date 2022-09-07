package com.some.figures;

public abstract class Shape {
    public abstract float getArea();
    public String getClassName(){
        String[] temp =  getClass().toString().replace(" ","").replace("."," ").split(" ");
        return temp[temp.length-1];
    }
    public String getName(){
        return getClassName();
    }
}
