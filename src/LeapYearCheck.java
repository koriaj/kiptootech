public class LeapYearCheck {
    public static void main(String[] args) {
        int year=2000;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not a Lip Year");
                }

            }else {
                System.out.println(" Not a leap Year");
            }
        }else {
            System.out.println("Not a leap year");
        }
    }
}
