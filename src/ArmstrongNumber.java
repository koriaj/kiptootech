public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int m=n;
        int sum=0;
        while (n>0){
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println("The Sum is "+sum);
        if (sum==m){
            System.out.println("It is an Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
