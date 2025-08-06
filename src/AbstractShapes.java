abstract class Shapes{
    public abstract double area();
    public abstract double perimeter();
}
class Rectangl extends Shapes{
    double length, breadth;
    @Override
    public double area() {
        return length*breadth;
    }
    @Override
    public double perimeter() {
       return 2*(breadth*length);
    }
}
class Circ extends Shapes{
    double radius;

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
public class AbstractShapes {
    public static void main(String[] args) {
       Rectangl r=new Rectangl();
    r.length=2;
      r.breadth=1.2;
        //System.out.println(r.area());
        Shapes s=r;
        System.out.println(s.area());
    }
}
