public class Printer {
    public void printName(Shape shape){
        System.out.println(String.join(" ","Shape name is",shape.getName()));
    }
    public void printArea(Shape shape){
        System.out.println(String.join(" ", shape.getName(),"area is",String.valueOf(shape.getArea())));
    }
}
