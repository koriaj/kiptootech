public class Arrays1 {
    public static void main(String[] args) {
        int A[]=new int[5];
        A[0]=4;
        A[1]=5;
        A[2]=2;
        A[3]=0;
        int B[]={2,4,5,6,7,3};
                for (int i=0;i<B.length;i++){
                    System.out.print(B[i]);

                }
        System.out.println();
                for (int x:A){
                    System.out.print(x);
                }
        //System.out.println(A[0]);
    }
}
