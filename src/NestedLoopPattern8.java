public class NestedLoopPattern8 {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){
            //System.out.print(i);
            for (int j=1;j<=5-i+1;j++){

                System.out.format(j+" ");
            }
            System.out.println();
        }
    }
}
