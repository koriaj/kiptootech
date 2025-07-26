import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String arr[]={"Sql","Java","Python","JavaScript","pascal","React"};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("");
        Arrays.sort(arr);
        for (String x:arr){
            System.out.print(x);
        }
    }
}
