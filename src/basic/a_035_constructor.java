package basic; /**
 * a_035_constructor
 */
import java.util.*;
class demo_a_035
{
    int age;
    String Name;
    float salary;
    demo_a_035()
    {
        age=0;
        Name="";
        salary=0.0f;
        System.out.println("Default constructor called");
    }
    demo_a_035(int age,String Name,float salary)
    {
        this.salary=salary;
        this.Name=Name;
        this.age=age;
        System.out.println("Parameterized constructor called");
    }
    demo_a_035(demo_a_035 obj)
    {
        this.age=obj.age;
        this.Name=obj.Name;
        this.salary=obj.salary;
        System.out.println("Copy constructor called");
    }
}
public class a_035_constructor {

    public static void main(String[] args) {
        /*

        constructor in java is a special method in a class it executes automatically 
        when an object for a class is created

        the main purpose of constructor is to allocate memory space for the class variables

        rules for constructor
        constructor name should be same as className
        it should not be private
        do not specify any accessModifier
        it should not return any object

        types of constructor 
        1.default
            default constructor is a constructor which is default written by java not visible in code
            user need not to mention default constructor
            but user can override the default constructor

        2.parameterized/userdefined
            parameterized constructor is a user defined constructor in arguements are passed to constructor
            we can get the values from user and assign it to the class variables
            we can perform method overloading in parameterized constructor
            but there is not return type only no of arguements are differ
        
        3.Copy constructor
            it is also a type of parameterized constructor in which it takes an object of the class as parameter
            and it copy the properties of the given object to a new object
            this way the modification of one object will not affect the other object

         */

         Scanner in=new Scanner(System.in);
         System.out.print("Enter age : ");
         int age=in.nextInt();
         System.out.print("Enter Name : ");
         in.nextLine();
         String name=in.nextLine();
         System.out.print("Enter Salary : ");
         float salary=in.nextFloat();

        demo_a_035 obj=new demo_a_035();
        demo_a_035 obj1=new demo_a_035(age, name, salary);
        demo_a_035 obj2=new demo_a_035(obj1);

        System.out.println("obj1 Name : "+obj.Name);
        System.out.println("obj1 age : "+obj.age);
        System.out.println("obj1 salary : "+obj.salary);

        System.out.println();
        System.out.println();
        System.out.println("obj2 Name : "+obj1.Name);
        System.out.println("obj2 age : "+obj1.age);
        System.out.println("obj2 salary : "+obj1.salary);

        System.out.println();
        System.out.println();

        System.out.println("obj3 Name : "+obj2.Name);
        System.out.println("obj3 age : "+obj2.age);
        System.out.println("obj3 salary : "+obj2.salary);

    }
}