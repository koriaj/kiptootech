public class Method1 {
    int max(int x,int y){
        if (x>y){
            return x;
        }
        else return y;
    }
    public static void main(String[] args) {
        int a=5,b=7;
        Method1 m=new Method1();
        System.out.println(m.max(a,b));

    }
}
