public class MultithreadDemo2 extends Thread{
    @Override
    public void run() {
        int i=1;
        while (true){
            System.out.println("Running");
            i++;
        }
    }

    public static void main(String[] args) {
        MultithreadDemo2 th=new MultithreadDemo2();
        th.start();
        int i=1;
        while (true){
            System.out.println("Sweating");
            i++;
        }
    }
}
