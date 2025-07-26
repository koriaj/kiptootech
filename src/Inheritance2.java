
class Ccircle
{
    public double radius;

    public double area()
    {
        return Math.PI * radius *radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Ccylinder extends Ccircle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }

}








public class Inheritance2
{

    public static void main(String[] args)
    {
        Ccylinder c=new Ccylinder();

        c.radius=7;
        c.height=10;

        System.out.println("Volume "+c.volume());
        System.out.println("Area "+c.area());

    }

}


