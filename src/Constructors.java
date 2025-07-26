class Rectanglee{
    private double length;
    private double breadth;
    public Rectanglee(){
length=1;
breadth=1;
    }
    public Rectanglee(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public Rectanglee(double s){
        setLength(s);
    }

    public void setBreadth(double breadth) {
        if (breadth>=0)
           this.breadth = breadth;
        else
          this. breadth=0;
    }

    public double getBreadth() {
        return breadth;
    }
    public void setLength(double length) {
        if (length>=0)
            this.length = length;
        else
            this.length =0;
    }

    public double getLength() {
        return length;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class Constructors {
    public static void main(String[] args) {
Rectanglee rs=new Rectanglee();
rs.setBreadth(4);
rs.setLength(6);
        System.out.println("Length: " + rs.getLength());
        System.out.println("Breadth: " + rs.getBreadth());
        System.out.println("Area: " + rs.area());
        System.out.println("Perimeter: " + rs.perimeter());
    }
}
