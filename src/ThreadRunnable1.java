public class ThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        int a=1;
        while (true){
            System.out.println("Hello");
            a++;
        }
    }

    public static void main(String[] args) {
        ThreadRunnable1 tr=new ThreadRunnable1();
        Thread t=new Thread(tr);
        t.start();
        int i=1;
        while (true){
            System.out.println("World");
            i++;
        }

    }
}
