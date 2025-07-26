import java.util.Scanner;

public class SwichtCaseMathsOps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("");
        System.out.println("Enter the operation");
        sc.nextLine();
        String ops = sc.nextLine();
        ops=ops.toUpperCase();


        switch (ops){
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
    }
}
