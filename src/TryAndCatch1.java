public class TryAndCatch1 {
    public static void main(String[] args) {

          try {
              int a=4,b=0,c;
              c=a/b;
              System.out.println(c);

          }
          catch (ArithmeticException e){
              System.out.println("Denominator cannot be zero");
          }
        System.out.println("Bye");

        }

}
