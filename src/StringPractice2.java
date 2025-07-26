public class StringPractice2 {
    public static void main(String[] args) {
        //startsWith
        String str="www.abcd.org";
        System.out.println(str.startsWith("www."));
        System.out.println(str.endsWith(".org"));
        //charAt
        str.charAt(9);
        System.out.println(str.charAt(2));
        //indexOf
        str.indexOf("o");
        System.out.println(str.indexOf("w",1));
        //lastIndexOf
        str.lastIndexOf(".");
        System.out.println(str.lastIndexOf("."));
        System.out.println(str.lastIndexOf(".",7));
    }
}
