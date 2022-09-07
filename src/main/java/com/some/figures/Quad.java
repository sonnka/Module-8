package com.some.figures;

public class Quad extends Shape {
    private int side;
    public Quad(){
    }
    public Quad(int side){
        this.side = side;
    }
    public void setSide(int side){
        this.side = side;
    }
    @Override
    public float getArea(){
        return (float) side * (float) side;
    }
}
