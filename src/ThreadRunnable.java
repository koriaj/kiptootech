class Myy implements Runnable{
    @Override
    public void run() {
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        Myy m=new Myy();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"World");
            i++;
        }
    }
}
