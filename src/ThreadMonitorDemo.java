class PrintText{
    public void chapisha(String txt){
        synchronized (this)
        {
            for (int i=0;i<txt.length();i++){
                System.out.print(txt.charAt(i));
            }
        }
    }
}
class CitizenNews extends Thread{
    PrintText p;
    CitizenNews(PrintText p){
        this.p=p;
    }
    @Override
    public void run() {
        p.chapisha("John ");
    }
}

class NationNews extends Thread{
    PrintText p;
    NationNews(PrintText p){
        this.p=p;
    }

    @Override
    public void run() {
        p.chapisha("Korir Kiptoo");
    }
}
public class ThreadMonitorDemo {
    public static void main(String[] args) {
        PrintText pt=new PrintText();
       CitizenNews cn=new CitizenNews(pt);
       NationNews nn=new NationNews(pt);

       cn.start();
       nn.start();

    }
}
