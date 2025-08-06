class Ttestt{
    static int x=10;
    int y=23;
    void show(){
        System.out.println(x);
    }
    static void display(){
        System.out.println(x);
        //System.out.println(y); can never access non static variables
    }
}
public class StaticDemo {

    public static void main(String[] args) {
        Ttestt tw1=new Ttestt();
        tw1.show();


    }
}
