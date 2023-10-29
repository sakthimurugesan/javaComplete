/**
 * a_042_method_overriding
 */

 class parent1_a042
 {
    void phone()
    {
        System.out.println("Parent-1 class phone");
    }
 }
 class child1_a042 extends parent1_a042
 {
    
 }
 class parent2_a042
 {
    void phone()
    {
        System.out.println("Parent-2 class phone");
    }
 }
 class child2_a042 extends parent2_a042
 {
    void phone()
    {
        System.out.println("Child-2 class phone");
    }
 }


public class a_042_method_overriding {
    public static void main(String[] args) {
        /*
        method overriding is the concept of overriding the base-class method in derived-class

        example in consider there is a class parent and class child
        child extends parent

        now parent has method called phone 
        phone can also be accessed by child object

        if the child has its own method phone when it will not call the parent-class phone()
         */

         child1_a042 obj=new child1_a042();
         obj.phone();
         child2_a042 obj2=new child2_a042();
         obj2.phone();
    }

}