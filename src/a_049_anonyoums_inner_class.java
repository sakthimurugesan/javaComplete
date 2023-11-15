abstract class a_049_demo_class
{
    abstract void hello();
}
public class a_049_anonyoums_inner_class {
    /*
     it is a type of class that overrides the abstract class directly without creating another class

     using anonymous inner class we can create object for abstract class

     we cannot access more functions other than methods in abstract class
     */
    public static void main(String[] args) {
        a_049_demo_class obj=new a_049_demo_class() {
            @Override
            void hello() {
                System.out.println("Saying hello");
            }
        };
        obj.hello();
    }

}
