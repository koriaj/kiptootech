public class RegularExpression1 {
    public static void main(String[] args) {
        //metacharacters
        String st="w";
        System.out.println(st.matches("\\w"));//Any characters
        String st1=" ";
        System.out.println(st1.matches("\\s"));
        System.out.println(st1.matches("\\S"));
        String st2="2";
        System.out.println(st2.matches("\\d"));
        System.out.println(st2.matches("\\D"));
        String str1="$";
        System.out.println(str1.matches("\\D"));

    }
}
