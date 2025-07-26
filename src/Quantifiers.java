public class Quantifiers {
    public static void main(String[] args) {
        String str1="ab6cdf";
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str1.matches("[a-z0-9]*"));
        String str="";
        System.out.println(str.matches("[abc]*"));
        System.out.println(str.matches("[abc]+"));
        String st2="accb";
        System.out.println(st2.matches("[abc]{3}"));
        System.out.println(st2.matches("[abc]{4}"));
        System.out.println(st2.matches("[abc]{2,7}"));
        String gmail="korirkiptoo41@gmail.com";
        System.out.println(gmail.matches(".*gmail.*"));
        System.out.println(gmail.matches("\\w.*@gmail.*"));
    }
}
