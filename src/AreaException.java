public class AreaException {
    static  int areaRect(int l, int b) throws Exception {
        if (l<=0||b<0)
            throw new Exception();
        return l*b;
    }
    static void meth1() throws Exception{
        System.out.println("Area is :"+areaRect(-2,4));
    }
    public static void main(String[] args){
try {
    meth1();
}catch (Exception e){
    System.out.println("L or B cannot be 0 or negative");
}
    }
}
