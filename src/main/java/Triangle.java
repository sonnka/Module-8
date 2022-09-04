public class Triangle extends Shape{
    private int side;
    private int height;

    public Triangle(){
    }
    public Triangle(int side, int height){
        this.side = side;
        this.height = height;
    }
    public void setSide(int side){
        this.side = side;
    }
    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public float getArea(){
        return 0.5f * (float) side * (float) height;
    }
}
