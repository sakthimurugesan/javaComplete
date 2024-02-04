package basic;

/**
 * a_043_dynamic_method_dispatch
 */
class parent_a043
{
    void SayHi()
    {
        System.out.println("Say Hi");
    }
    void SayBye()
    {
        System.out.println("Thanks");
    }
}

class child_a043 extends parent_a043
{
    void SayBye()
    {
        System.out.println("Say Bye");
    }

    void SayThanks()
    {
        System.out.println("Say Thanks");
    }
}
public class a_043_dynamic_method_dispatch {

    public static void main(String[] args) {
        /*
        dynamic method dispatch is also called run-time polymorphism

        it is a concept of having derived class object with base class reference

        if the base-class has method SayBye and derived-class override that method
        we can call the sayBye from derived class using base-class method

        note: only overrided method can be called using this approach
         */
       parent_a043 obj=new child_a043();
       obj.SayHi();
       obj.SayBye();
    }
}