package basic;

public class a_050_static_inner_class {
    static class hello
    {
        hello()
        {
            System.out.println(x);
            System.out.println(new a_050_static_inner_class().y);

        }
    }
    static int x=10;
    static int x1;
    static
    {
        x1=10;
    }
    String y="Hello";
    int z=10;
    public static void main(String[] args) {
        /*
   static variables
        static methods
        static nested class
        static blocks

        static keywords are used to represents the information about the class and data

        main purpose using static keyword is it the block or vari or method that is created the first when a class is created

        when a class is created first static variables will assign values
        then static blocks will excutes
        then main method which is also static
        static inner class will excute based on the place of object creation

        static variables shares same values amoing different objects
        if one objects changes the value another object will also affect it
        they can be accessed without any objects

        static methods can be accessed without objects using class name
        static methods can access only static vari because only static variable
        have memory spaces

        static blocks are excuted after the creation of object for a class 

        we cannot create static class outside the class which contains the main method
        */
        System.out.println("Hello from main");
        hello obj=new hello();

    }
    static{

        System.out.println("Hello from static");
        System.out.println("X from static "+x);
        // System.out.println("Z from static "+z);

    }
}
