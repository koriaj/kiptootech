class Circle1{
public double radius;

public double area(){
        double area=Math.PI*radius*radius;
        return area;
        }
public double perimeter(){
        double calPeri=2*Math.PI*radius;
        return calPeri;
        }
public double circumference(){
        return perimeter();
        }
        }

public class OOPCircle {

    public static void main(String[] args) {
        Circle1 c1=new Circle1();
         c1.radius=2.4;
        System.out.println(c1.perimeter());
        System.out.println(c1.area());
        System.out.println(c1.circumference());

    }

}
