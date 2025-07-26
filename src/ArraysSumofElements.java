public class ArraysSumofElements {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        /*x:A){
           // System.out.println(x);
            sum=sum+x;
        }
        System.out.println(sum);*/
        for (int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println("Sum is "+sum);
    }
}
