class ATM{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println("Balance");
    }

    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(amount);

    }
}
class Mteja extends Thread
{
    String name;
    int amount;
    ATM atm;

    Mteja(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}
public class ATMThread {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Mteja c1 = new Mteja("Kiptoo",atm,1200);
        Mteja c2 = new Mteja("John", atm, 279);
        c1.start();
        c2.start();
    }
}
