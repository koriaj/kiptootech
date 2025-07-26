public class Palindrome {
    public static void main(String[] args) {
        int n=23432;
        int m=n;
        int rev=0,r;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (m==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
