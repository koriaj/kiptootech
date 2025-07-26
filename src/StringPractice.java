public class StringPractice {
    public static void main(String[] args) {
        String str1="Java Program";
        String str2=new String("JAVA");
        char c[]={'h','e','l','l','o'};
        byte b[]={65,66,67,68};
        String str5=new String(b,2,2);
        String str3=new String(c);
        String str4=new String(b);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        //pool
        String str6="Java";
        String str7="Java";
        String str8="java";
        System.out.println(str6==str7);
        System.out.println(str6==str8);
        //Object creation in Heap
        String str9=new String("Java");
        System.out.println(str9==str6);
        //String Methods
        //length()
        int l=str1.length();
        System.out.println(l);
        //to lowercase
        String strr=str1.toLowerCase();
        System.out.println(strr);
        //to uppercase
        String upp=str1.toUpperCase();
        System.out.println(upp);
        // Trim Method=remove blank spaces
        String sstr="    Welcome  ";
        System.out.println(sstr);
        String tr=sstr=sstr.trim();
        System.out.println(tr);
        //substring
       String ssttr=sstr.substring(3);
        System.out.println(ssttr);
        String ssttrr=sstr.substring(3,6);
        System.out.println(ssttrr);
        //Replace
        String s=sstr.replace('e','o');
        System.out.println(s);
    }
}
