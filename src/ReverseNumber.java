public class ReverseNumber {
    public static void main(String[] args) {
        int n=234;
        int rev=0,r;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
