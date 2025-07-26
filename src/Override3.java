
class Car{
    public void start(){
        System.out.println("Car is started");
    }
    public void accelerate(){
        System.out.println("Car accelerates");
    }
    public void changeGear(){
        System.out.println("Gear changed Manually");
    }
}
class HondaCar extends Car{
    public void start() {
        System.out.println("Hondacar Start");
    }


    public void accelerate() {
        System.out.println("Honda Acceleate");
    }
    public void changeGear(){
        System.out.println("Automatic gear change");
    }
}

public class Override3 {
    public static void main(String[] args) {
HondaCar c =new HondaCar();
c.start();
c.accelerate();
c.changeGear();
    }
}
