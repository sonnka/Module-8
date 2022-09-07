package com.testers;

import com.some.figures.*;

public class Tester {
    public static void main(String[] args){
        Printer printer = new Printer();

        Circle item1 = new Circle();
        item1.setRadius(5);

        printer.printName(item1);
        printer.printArea(item1);

        Quad item2 = new Quad(4);

        printer.printName(item2);
        printer.printArea(item2);

        Rectangle item3 = new Rectangle();
        item3.setHeight(5);
        item3.setWidth(7);

        printer.printName(item3);
        printer.printArea(item3);

        Sphere item4 = new Sphere();
        item4.setRadius(2);

        printer.printName(item4);
        printer.printArea(item4);

        Triangle item5 = new Triangle(6,4);

        printer.printName(item5);
        printer.printArea(item5);
    }
}
