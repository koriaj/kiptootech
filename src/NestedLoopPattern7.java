public class NestedLoopPattern7 {
    public static void main(String[] args) {

            int count7=0;
            for (int i=1;i<=5;i++){
                //System.out.print(i);
                for (int j=1;j<=i;j++){
                    count7++;
                    System.out.format("%02d ",count7);
                }
                System.out.println();
                }

            }
    }

