public class MethodVariableArguments {
    static void show(int...A){
        for (int x:A)
            System.out.print(x+",");
    }
    static void showList(String...s){
        for (int i=0;i<s.length;i++){
            System.out.println(i+1+". "+s[i]);
        }
    }
    public static void main(String[] args) {
        show();
        show(34,43,45);
        System.out.println();
        show(new int[]{2,3,2,5});
        System.out.println();
        showList("John","Korir","Ajay","Ahmed");
    }
}
