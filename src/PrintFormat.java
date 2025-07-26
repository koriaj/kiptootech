public class PrintFormat {
    public static void main(String[] args) {
        int x=23,z=34;
        float y=43.77f;
        char c='K';
        String str="Korir";
        System.out.printf("%d %c %f",x,c,y);
        //argument index
        System.out.printf("%1$d %1$d %1$d",x);
        System.out.println(" ");
        System.out.printf("%3$s %1$f %2$c",y,c,str);
    }
}
