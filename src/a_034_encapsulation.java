import java.util.Scanner;

/**
 * a_034_encapsulation
 */
class demo_a_034
{
    private int age;
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
public class a_034_encapsulation {
    public static final int age=15;
    /*
    Encapsulation is a fundamental concept in object-oriented programming (OOP) that
     refers to the bundling of data and methods that operate on that data within a 
     single unit, which is called a class in Java. Encapsulation is a way of hiding 
     the implementation details of a class from outside access and only exposing a 
     public interface that can be used to interact with the class.

    In Java, encapsulation is achieved by declaring the instance variables of a class
     as private, which means they can only be accessed within the class. To allow 
     outside access to the instance variables, public methods called getters and 
     setters are defined, which are used to retrieve and modify the values of the 
     instance variables, respectively. By using getters and setters, the class can 
     enforce its own data validation rules and ensure that its internal state remains 
     consistent.
     */

     public static void main(String[] args) {
        demo_a_034 obj=new demo_a_034();
     
     System.out.print("Enter name : ");
     Scanner in=new Scanner(System.in);
     obj.setName(in.nextLine());
     System.out.print("Enter age : ");
     obj.setAge(in.nextInt());
     
     System.err.println("Age : "+obj.getAge());
     System.err.println("Name : "+obj.getName());
     }
}
