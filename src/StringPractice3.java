public class StringPractice3 {
    public static void main(String[] args) {
        String str0="JAVA";
        String str="java";
        String str1="python";
        String str2="python";
        //==
        System.out.println(str1==str2);
        //equals()
        System.out.println(str0.equals(str));
        System.out.println(str1.equals(str2));
        //equalsIgnoreCase
        System.out.println(str0.equalsIgnoreCase(str));
        System.out.println(str1.equalsIgnoreCase(str2));
        //compareTo
        System.out.println(str0.compareTo(str));//Upper case is lower than lowecase=-32
        System.out.println(str1.compareTo(str));
        //contains method
        String st="The great wall of china";
        System.out.println(st.contains("china"));
        //concatinate
        String st1="Hello";
        String st2="people";
        System.out.println(st1.concat(st2));

    }
}
