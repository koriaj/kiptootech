import static java.lang.Thread.sleep;

class MyTthread extends Thread{
    public MyTthread(String name){
        super(name);
       // setPriority(Thread.MIN_PRIORITY+2);
    }

    @Override
    public void run() {
        int count=1;
        while (true){
            System.out.println(count++ +"My Thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyTthread mt=new MyTthread("Korir");
        //mt.start();
        System.out.println(mt.threadId());
        System.out.println(mt.getPriority());
        mt.setDaemon(true);
        mt.start();
       /* try {
            Thread.sleep(1000);
        }catch (Exception e){

        }*/

        System.out.println(mt.getState());
        System.out.println(mt.getName());
        System.out.println(mt.isAlive());
       // mt.interrupt();
        Thread mainThread=Thread.currentThread();
        mainThread.join();


    }
}
