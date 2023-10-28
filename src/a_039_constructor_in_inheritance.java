/**
 * a_039_constructor_in_inheritance
 */
class demo_a039
{
    demo_a039()
    {
        System.out.println("base class constructor");   
    }
}
class demo2_a039 extends demo_a039
{
    demo2_a039()
    {
       System.out.println("child class constructor");    
    }
}
public class a_039_constructor_in_inheritance {

    public static void main(String[] args) {
        /*
        constructor in inheritance

        inheritance concept when the object is created for the derived class
        the constructor of derived class is called

        but before doing that it will call the constructor of base-class as well

        it only class the default constructor of both classes
         */
        System.out.println("Object created for child class");
        demo2_a039 obj=new demo2_a039();

    }
}