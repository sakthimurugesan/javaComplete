package basic;

abstract class abstract_1
{
    abstract void display();
    void display2()
    {
        System.out.println("Display 2");
    }
}

class abstract_2 extends abstract_1
{
    @Override
    void display()
    {
        System.out.println("Display 1 from child class");
    }
   
}

public class a_044_abstract_class {
    public static void main(String[] args) {
        /*
        abstract class is a class which does not have a function body
        it only has the function declaration

        abstract class is mainly created for method overriding
        another reason of using a abstract class is because it 
        acts like a standard class because class inherting abstract class have to override all the abstract methods of that class

        abstract class can have both abstract and concrete class

        1.abstract class cannot have object 
        2.class inheriting abstract class must override all the functions else that is also a abstract class
        
         */
        abstract_2 obj=new abstract_2();
        obj.display();
        obj.display2();

        abstract_1 obj2=new abstract_2();
        obj2.display();;
        obj2.display2();;
    }
}
