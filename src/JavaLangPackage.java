class MyObject{

}
class MyObject1 extends MyObject{

}
public class JavaLangPackage {
    public static void main(String[] args) {
        MyObject mo=new MyObject();
        System.out.println(mo.hashCode());

        int a=123;
        String aa="23242";
        System.out.println("Reverse"+Integer.reverse(a));
        System.out.println(Integer.parseInt(aa));

    }
}
