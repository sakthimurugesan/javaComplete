package basic;

public class a_048_local_inner_class {
    public static void main(String[] args) {
        /*
         local inner class is defined inside a local body like a functiom condtional-statement or looping etc,.

         we can access the class with an object only inside that local body
         outside the local body class is invisible and it throws classnotfoundexception
         */
        class a_048_local_inner_class_1
        {
            void hello(){
            System.out.println("Hello");
            }
        }
        a_048_local_inner_class_1 obj=new a_048_local_inner_class_1();
        obj.hello();
    }

}
