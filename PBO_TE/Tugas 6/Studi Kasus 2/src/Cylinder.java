public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder(double hei, double rad){
        super("Cylinder");
        height = hei;
        radius = rad;
    }

    @Override
    public double area(){
        return 2 * Math.PI * radius * (radius + height);
    }

    public String toString(){
        return super.toString() + " radius " + radius + " height " + height;
    }
}
