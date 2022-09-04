public class Sphere extends Circle{
    public Sphere(){
    }
    public Sphere(int radius){
        super(radius);
    }
    @Override
    public float getArea(){
        return 4f * (float) Math.PI * (float) radius * (float) radius;
    }
}
