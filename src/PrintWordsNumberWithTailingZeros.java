public class PrintWordsNumberWithTailingZeros {
    public static void main(String[] args) {
        int n=1700, r;
        String str="";
        while (n>0){
            r=n%10;
            str=str+r;
            n=n/10;
        }
        //System.out.println(str);
        char c;
        for (int i=str.length()-1; i>=0;i--){
            c=str.charAt(i);
           // System.out.println(c);
            switch (c){
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                    case '8':
                    System.out.println("Eigth");
                    break;case '9':
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid");


            }
        }
    }
}
