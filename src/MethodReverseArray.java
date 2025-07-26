import java.util.Arrays;
import java.util.Collections;

public class MethodReverseArray {
    static void reverseArray(Integer A[]){
        Collections.reverse(Arrays.asList(A));
        System.out.print("Reversed Array: ");
        for (int x : A) {
            System.out.print(x + " ");
    }}

    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5};
        reverseArray(A);

    }
}
