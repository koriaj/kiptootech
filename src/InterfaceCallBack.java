interface Member
{
    public void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;

    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }

}

class Ccustomer implements Member
{
    String name;

    Ccustomer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);

    }

}
public class InterfaceCallBack {
    public static void main(String[] args) {
                Store s=new Store();
                Ccustomer c1=new Ccustomer("John");
                Ccustomer c2=new Ccustomer("Smith");

                s.register(c1);
                s.register(c2);

                s.inviteSale();
            }
}
