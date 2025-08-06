
class OutterClass{
    public void display(){
        class InnerClass{
            public void show(){
                System.out.println("inner class");
            }
        }
        new InnerClass().show();//Anonymous object
      //  InnerClass i=new InnerClass();
       // i.show();
    }

}

public class OuterClassDemo {
    public static void main(String[] args) {
        OutterClass ou=new OutterClass();
ou.display();
    }
}
