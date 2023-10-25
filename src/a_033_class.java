/**
 * a_033_class
 */
class demo_a_033
{
    public static final int age=19;
    public void displayAge()
    {
        System.out.print(age);
    }
   
}
public class a_033_class {

    public static void main(String[] args) {
        /*

        java is fully object oriented programming language
        everything is written inside the class
        all the methods are accessed only using the objects of the class
        some static methods are also used

        in java the program starts from the main() method in a program file
        the main() method should exist inside the className same as file name


        syntax

        access_modifier class className
        {
            // class block
        }

        object creation

        className identifier=new className();

        accessing method
        identifier.method();

        accessing variable

        identifier.variable

        class can have both methods and variables
        */

        demo_a_033 obj=new demo_a_033();
        obj.displayAge();
    }
}