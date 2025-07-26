public class MethodOverloading {
    static int max(int x, int y){
        return x>y?x:y;
    }
    static  float max(float x, float y){
        if (x>y)
            return x;
        else return y;
    }
    static  int max(int x, int y, int z){
        if (x>y)
            return x;
        else if (y>z)
        return y;
        else return z;

    }
    public static void main(String[] args) {
        int a=3,b=5;
        System.out.println(max(a,b));
        System.out.println(max(2f,4f));
        System.out.println(max(2,3,4));
    }
}
