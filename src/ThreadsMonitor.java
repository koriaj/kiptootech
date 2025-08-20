class MyData{
   synchronized public void display(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }

}
class MyThread1 extends Thread{
    MyData d;
    MyThread1(MyData dat){
        d=dat;
    }

    @Override
    public void run() {
        d.display("Hello World ");
    }
}
class MyThread2 extends Thread{
    MyData data;
    MyThread2(MyData dat){
        data =dat;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}
public class ThreadsMonitor {
    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread1 th1=new MyThread1(d);
        MyThread2 th2=new MyThread2(d);
        th1.start();
        th2.start();

    }
}
