public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle (double len, double wid){
        super("Rectangle");
        length = len;
        width = wid;
    }

    @Override
    public double area(){
        return length * width;
    }

    public String toString(){
        return super.toString() + " panjang " + length + " lebar " + width;
    }
}
