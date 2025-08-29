public class StringBufferBuilder {
    public static void main(String[] args) {
        String test=new String("Korir");
        StringBuffer test1= new StringBuffer("Korir");
        StringBuilder test2=new StringBuilder("Korir");

        test.concat("Kiptoo");
        test1.append("Kappend");
        test2.append("Builder");
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);

    }
}
