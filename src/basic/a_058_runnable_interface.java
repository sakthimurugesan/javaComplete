package basic;

/**
 * Innera_058_runnable_interface
 */
class a_058_runnable_interface_1 implements Runnable {

    @Override
    public void run()
    {
        System.out.println("Hello world!!!");
    }
}
public class a_058_runnable_interface {
    public static void main(String[] args) {
        Thread obj=new Thread(new a_058_runnable_interface_1());
        obj.start();
        
    }
}
