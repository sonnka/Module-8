public abstract class Shape {
    public abstract float getArea();
    public String getName(){
        return getClass().toString().replace(" ","").replace("class","");
    }
}
