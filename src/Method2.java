public class Method2 {
   static void change(int A[],int index,int value){
        A[index]=value;
    }

    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        for (int y:A){
            System.out.print(y+",");
        }
        System.out.println();
        change(A,2,40);
        for (int x:A){
            System.out.print(x+",");
        }
    }
}
