public class ArrayReverseCopying {
    public static void main(String[] args)
    {int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];

        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }

        System.out.print("Reversed Array: ");
        for (int x : B) {
            System.out.print(x + " ");
        }
    }}

