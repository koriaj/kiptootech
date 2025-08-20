
public class MultithreadDemo {
    static void display(){
        while (true){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        display();
        while (true){
            System.out.println("World");
        }
    }
}
