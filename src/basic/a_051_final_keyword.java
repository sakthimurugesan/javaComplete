package basic;

/**
 * Innera_051_static_keyword
 */
final class demo_a_051_final_keyword {

   
    
}
// class demo_2_a_051_final_keyword extends demo_a_051_final_keyword
// {

// }

// uncomment and see it will show u an error
class demo_2_a_051_final_keyword
{
    final void hello()
    {
        System.out.println("Hello");
    }
}
class demo_3_a_051_final_keyword extends demo_2_a_051_final_keyword
{
    // final void hello()
    // {
    //     System.out.println("Hello");
    // }

    
    // uncomment and see it will show u an error
}
public class a_051_final_keyword {
    static final int x=10;
    public static void main(String[] args) {
        /*
        
        final vari
        final method
        final class

        final keyword is used with variable to act as a constant
        the value of final variable can't be changed
        final variable can be initalized only within a static block or constructor
        if we are overloading constructor we have initalize in every constructor
        final keyword can also be static

        final methods are used not to override the method in the derived class

        final class are ussd not to extends the class
         */
     
    }
}
