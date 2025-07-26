import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        //ArithmeticProgression
        //e.g 1,3,5,7
        //starting term=1, common difference=2, number of terms
        int startTerm=2;
        startTerm=3;
        int commonDif=2;
        int numberTerms=10;

       for (int i=0;i<numberTerms; i++){
            System.out.print(startTerm+", ");
            startTerm=startTerm+commonDif;
        }

        }

    }

