public class RegularExpression {
    public static void main(String[] args) {
        //. - Any single character
        String str="W";
        System.out.println(str.matches("."));//True= w is a single character
        String strr="Welcome";
        System.out.println(strr.matches("."));//False-more than one characters
        // [abc]
        String str1="d";
        System.out.println(str1.matches("[abc]"));
        System.out.println("NEGATE "+str1.matches("[^d]"));
        System.out.println("a|d="+str1.matches("a|d"));
        //[a=z][1-7]
        System.out.println(str1.matches("[a-z1-7]"));
        String ss="j4";
        System.out.println(ss.matches("[a-z][0-9]"));
    }
}
