package basic;

/**
 * a_057_multithreading
 */
class a_057_multithreading_1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello world");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Hello world");
    }
}
public class a_057_multithreading {

    public static void main(String[] args) {
        a_057_multithreading_1 t=new a_057_multithreading_1();
        t.start();
    }
}