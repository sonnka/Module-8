package com.some.figures;

public class Circle extends Shape {
    protected int radius;

    public Circle(){
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    @Override
    public float getArea(){
        return (float) Math.PI * (float) radius * (float) radius;
    }
}
