/**
 * a_029_method_overloading
 */
public class a_029_method_overloading {
    public static int maximum(int a,int b)
    {
        System.out.println("int maximum method called");
        return a>b?a:b;
    }

    public static float maximum(float a,float b)
    {
        System.out.println("float maximum method called");
        return a>b?a:b;
    }

    public static double maximum(double a,double b)
    {
        System.out.println("double maximum method called");
        return a>b?a:b;
    }

    public static void main(String[] args) {
        /*
         method overloading in java is concept that more methods have same name
         but different return type and different length of arguements and different datatype of arguements

         rules
         1.same method name
         2.different return type
         3.no of arguements length should vary
         4.data type of arguements should vary

         method overloading is used when we need to do same operations with different type of datas
         like finding maximum of two number
         we will find max of two number with data types like float,long,double,int,short,byte
         */

         System.out.println(maximum(5.36D, 98.65D));
         System.out.println(maximum(5.36, 98.65)); // this will also call double maximum method because default number without decimal values are double in java for float we need to mention f
         System.out.println(maximum(5.36f, 98.65f));
         System.out.println(maximum(5, 98));
         /*
          int maximum(int a,int b,int c)
          int maximum(int a,int b,int c,int d)
          int maximum(int a,int b,int c,int d,int e)
          */
    }
}