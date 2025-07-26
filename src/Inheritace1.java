class CircleInhe{
    private double radius;
    public CircleInhe(){
       this.setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinderinhe extends CircleInhe{
    private double height;

    public Cylinderinhe()
    {
        this.setHeight(height);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double volume(){
        return area()*height;
    }

}


public class Inheritace1 {
    public static void main(String[] args) {
        CircleInhe c=new CircleInhe();
        c.setRadius(2.2);
        System.out.println("Area of a Circle: "+c.area());
        Cylinderinhe cy=new Cylinderinhe();
        cy.setHeight(5.2);
        cy.setRadius(2.3);
        System.out.println("Volume of a Cylinder: "+cy.volume());
    }
}
