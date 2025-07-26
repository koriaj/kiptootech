import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email address");
        String email=sc.nextLine();
        String protocol=email.substring(0,email.indexOf(":"));
        if (protocol.equalsIgnoreCase("http")){
            System.out.println("Hyper Text Transfer Protocol");
        }
        else {
            System.out.println("File Transfer Protocol");
        }
    }
}
