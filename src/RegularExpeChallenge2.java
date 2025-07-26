public class RegularExpeChallenge2 {
    public static void main(String[] args) {
        //Find if a number is Binary or not
        int b=10120;
    String st=String.valueOf(b);
        System.out.println(st.matches("[01]+"));
        //Find if the number is Hexadecimal or not
        int h=12389;
        String sst=String.valueOf(h);
        System.out.println(sst.matches("[0-9A-F]+"));
        //Find if data in Date format(dd/mm/yyy)
        String sttr="01/12/2000";

        System.out.println(sttr.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
