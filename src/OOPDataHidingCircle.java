class Circle{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

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
public class OOPDataHidingCircle {

        public static void main(String[] args) {
            Circle c1=new Circle();
            c1.setRadius(2.3);
            System.out.println(c1.perimeter());
            System.out.println(c1.area());
            System.out.println(c1.circumference());

        }

    }


