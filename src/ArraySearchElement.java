public class ArraySearchElement {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int key=7;
        for (int i=0;i<A.length;i++){
            if (key==A[i]){
                System.out.println("Element is found in index "+i);
                System.exit(0);
            }

        }
        System.out.println("Not found");
    }
}
