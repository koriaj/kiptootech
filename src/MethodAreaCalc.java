public class MethodAreaCalc {
    static  double area(double l,double w){

        return l*w;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.println(area(2,4));
        System.out.println(area(3.4));
    }
}
