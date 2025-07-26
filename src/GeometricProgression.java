public class GeometricProgression {
    public static void main(String[] args) {
        int startVal=1,commonRation=2, numberofTerms=10;
       int term=startVal;
        for (int i=0; i<numberofTerms;i++){
            System.out.print(term+", ");
            term=term*commonRation;
        }
    }
}
