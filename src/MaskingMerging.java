public class MaskingMerging {
    public static void main(String[] args) {
        byte a=9,b=12,c;
        c=(byte) (a<<4);
        c=(byte) (c|b);
        System.out.println("a= to the right of c= "+((c&0b11110000)>>4));
        System.out.println("b= to the right of c= "+(c&0b0001111));

        int aa=34,bb=43,cc;
        cc=bb>>32;
        cc=aa|cc;
        System.out.println((bb&0b11111111000000000000000000000000)>>32);

    }
}
