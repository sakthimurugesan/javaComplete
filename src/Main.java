/**
 * Main
 */
class Hello
{
    private void sayHello()
    {
        System.out.print("Hello !!!");
    }
    Hello()
    {
        this.sayHello();
    }
}
public class Main {

    public static void main(String[] args) {
        Hello h=new Hello();
    }
}