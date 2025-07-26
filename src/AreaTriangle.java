import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {

System.out.println("Area of the triangle is "+ area()+" Meters square");
        System.out.println(area3Sides());
    }
    public static double area(){
        Scanner sc=new Scanner(System.in);
        double b,h,area;
        System.out.println("Enter the base measurements in Meters");
        b=sc.nextDouble();
        System.out.println("Enter the height measerements in Meters");
        h= sc.nextDouble();
         return area=0.5*b*h;
       //
    }
    public static double area3Sides(){
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        double area;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(float)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
return area;
    }
}
