public class ArrayInsertElement {
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        System.out.println(A[6]);
        for (int x:A)
            System.out.print(x+", ");
        int n=6;
        int x=20;
        int index=2;
        for (int i=n;i>index;i--){
            A[i]=A[i-1];
            A[index]=x;
        }
        System.out.println();
       for (int y:A)
           System.out.print(y+", ");

    }
}
