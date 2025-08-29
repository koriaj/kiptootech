class MyDdata{
   synchronized public void display(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }

}
class MyThread1 extends Thread{
    MyDdata d;
    MyThread1(MyDdata dat){
        d=dat;
    }

    @Override
    public void run() {
        d.display("Hello World ");
    }
}
class MyThread2 extends Thread{
    MyDdata data;
    MyThread2(MyDdata dat){
        data =dat;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}
public class ThreadsMonitor {
    public static void main(String[] args) {
        MyDdata d=new MyDdata();
        MyThread1 th1=new MyThread1(d);
        MyThread2 th2=new MyThread2(d);
        th1.start();
        th2.start();

    }
}
