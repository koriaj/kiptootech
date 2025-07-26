class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        double calArea=length*length;
        return calArea;
    }
    public double perimeter(){
        double calperimeter=2*(length+breadth);
        return calperimeter;
    }

}


public class OOPRectangle {
    public static void main(String[] args) {
Rectangle rct=new Rectangle();
rct.breadth=3.4;
rct.length=5.3;
        System.out.println(rct.area());
        System.out.println(rct.perimeter());
    }
}
