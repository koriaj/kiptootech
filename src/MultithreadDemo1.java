class MyThread extends Thread{
    @Override
    public void run() {
            int i=1;
            while (true){
                System.out.println("Hello");
                i++;
            }
        }
    }

public class MultithreadDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
int i=1;
while (true){
    System.out.println("World");
    i++;
}
    }
}
