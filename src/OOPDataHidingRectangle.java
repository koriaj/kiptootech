class Rectangle1 {
    private double length;
    private double width;
    public void setLength(double length){
        if (length>=0)
            this.length=length;
        else this.length=0;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        if (width>=0)
            this.width=width;
        else
            width=0;
    }
    public double area(){
        return length*width;
    }

        }
public class OOPDataHidingRectangle {
    public static void main(String[] args) {
        Rectangle1 rt=new Rectangle1();
        rt.setLength(2.3);
        rt.setWidth(2.1);
        System.out.println(rt.area());
    }
}
