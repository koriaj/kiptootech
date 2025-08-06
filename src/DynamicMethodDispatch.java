class Ssuper{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
}
class Ssub extends Ssuper{
    public void meth1(){
        System.out.println("Method1 Sub class");
    }

    public void meth2(){
        System.out.println("Method2 Sub class");
    }

    public void meth3(){
        System.out.println("Method3 Sub class");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Ssuper sup=new Ssub();
        sup.meth1();
        sup.meth2();
        //sup.meth3();
    }
}
