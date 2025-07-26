public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n=1237;
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println("The number of Digits in the number provided is "+count);
    }
}
