public class Sphere extends Shape{
    private double radius;

    public Sphere(double rad){
        super("Sphere");
        radius = rad;
    }

    @Override
    public double area(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString(){
        return super.toString() + " dengan Radius " + radius;
    }
}
