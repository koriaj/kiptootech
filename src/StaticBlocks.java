class StaticBlockOutside{
    static {
        System.out.println("Outside");
    }

        }
public class StaticBlocks {
    static {
        System.out.println("Block 1");
    }
    public static void main(String[] args) {
        StaticBlockOutside so=new StaticBlockOutside();
        System.out.println("Main Block 2");
    }
    static {
        System.out.println("Block 3");
    }
}
//Main method is executed once static blocks have been executed