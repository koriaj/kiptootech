class MyDddata
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer extends Thread
{
    MyDddata dddata;

    public Producer(MyDddata d)
    {
        dddata=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
             dddata.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyDddata dddata;

    public Consumer(MyDddata d)
    {
        dddata=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=dddata.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        MyDddata dddata=new MyDddata();
        Producer p=new Producer(dddata);
        Consumer c=new Consumer(dddata);
        p.start();
        c.start();

    }
}
