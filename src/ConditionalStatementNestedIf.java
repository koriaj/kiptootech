public class ConditionalStatementNestedIf {
    public static void main(String[] args) {
        int a=4,b=6,c=20;
        if (a>b&&a>c){
            System.out.println("a is the bigest number");
        }else {
            if (b>c){
                System.out.println("b is the biggest number");
            }else {
                System.out.println("c is the biggest number");
            }
        }
    }
}
