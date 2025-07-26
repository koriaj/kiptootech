public class ConditionalChallenge {
    public static void main(String[] args) {
        int i=5;
        //check whether the number is odd or even
        if (i%2==0)
        {
            System.out.println("The number is even number");
        }
        else {
            System.out.println("The number is an ODD");
        }
        //Find the person is young or not
        int age=12;
        if (age>14&&age<=55){
            System.out.println("The Person Young");
        }
        else {
            System.out.println("The person is Old");
        }
    }
}
