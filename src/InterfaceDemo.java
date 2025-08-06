interface Test{
    void meth1();
    void meth2();
}
class MyTest implements Test{
    @Override
    public void meth1() {
        System.out.println("Meth1 of class MyTest");
    }

    @Override
    public void meth2() {
        System.out.println("Metho2 of class MyTest");
    }
    public void meth3() {
        System.out.println("Metho3 of class MyTest");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
    Test t=new MyTest();
    t.meth1();
    t.meth2();
    }
}
