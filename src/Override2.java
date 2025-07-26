class Tv{
    public void switchON(){
        System.out.println("TV is switched on");
    }
    public void changeChannel(){
        System.out.println("TV Channel changed");
    }
}
class SmartTv extends Tv{

    public void switchON(){
        System.out.println("SmartTV is switched on");
    }
    public void changeChannel(){
        System.out.println("SmartTV Channel changed");
    }
    public void browse(){
        System.out.println("SmartTV browsing");
    }
}
public class Override2 {
    public static void main(String[] args) {
        Tv t=new SmartTv();
        t.switchON();
        t.changeChannel();
        //SmartTv st=new SmartTv();
        //st.switchON();
       // st.browse();
    }
}
