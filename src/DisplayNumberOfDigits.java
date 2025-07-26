import java.util.Scanner;

public class DisplayNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int n=67, r;
        //n=257
        //r=n%10
        //q=n/10
      while (n>0){
          r=n%10;
          System.out.println(r);
          n=n/10;
        }
    }
    }
