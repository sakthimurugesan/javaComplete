package basic;

/**
 * a_038_inheritance
 */

class A_038
{
    void helloFromA()
    {
        System.out.println("Hello from A");
    }
}
class B_038 extends A_038
{
    void helloFromB()
    {
        System.out.println("Hello from B"); // single inheritance
    }
}
class C_038 extends B_038
{
    void helloFromC()
    {
        System.out.println("Hello from C"); // multi-level inheritance
    }
}

public class a_038_inheritance {

    public static void main(String[] args) {
        /*
         
        inheritance is the concept of inheriting the method and properties of one class to another class
         
        this allows one class to access all features from one class to another
         
        parent-class super-class
        child-class sub-class
        base-class  derived-class
        
        we inherit one class to another class using extend keyword

        syntax

        class child extends parent
        {

        }
        parent-class is a class that allows another class to access from it
        child-class is a class that is accessing from the parent-class

        types of inheritance
            1.single inheritance
            2.mutli-level inheritance
        
        1.single inheritance
            it allows only one class to access from another class
            it allows only one classs

        2.multi-level inheritance
            it means parent of the subclass itself is a subclass of another parent class
         */

         System.out.println("Object of class B created");
         B_038 obj=new B_038();
         obj.helloFromA();
         obj.helloFromB();
         System.out.println("Object of class C created");
         C_038 obj1=new C_038();
         obj1.helloFromA();
         obj1.helloFromB();
         obj1.helloFromC();
    }
}