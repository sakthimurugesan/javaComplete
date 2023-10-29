/**
 * Innera_045_interface
 */
interface Innera_045_interface {
    void display();
    void display2();
    void display3();
    
}
class interfaceDemo implements Innera_045_interface
{
    
    public void display()
    {
        System.out.println("Hello world from Display 1");
    }
    public void display2()
    {
        System.out.println("Hello world from Display 2");
    }
    public void display3()
    {
        System.out.println("Hello world from Display 3");
    }
}
public class a_045_interface {
    public static void main(String[] args) {
        Innera_045_interface obj=new interfaceDemo();
        obj.display();
        obj.display2();
        obj.display3();
    }
}
