public class ArrayAddition2D {
    public static void main(String[] args) {
        int A[][]={{3,7,4},{5,6,3},{9,2,5}};
        int B[][]={{1,6,3},{5,8,9},{2,4,7}};
        int C[][]=new int [3][3];
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
               C[i][j]=A[i][j]+B[i][j];
            }
            for (int[] x:C){
              for (int y:x){
                  System.out.print(y+" ");
              }
                System.out.println("");
            }

        }
    }
}
