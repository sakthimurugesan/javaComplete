/*
 a try block must contain either a finally block or catch block
 when you add a exception class in catch block it should be added at last
 */
public class a_052_exception {
    public static void main(String[] args) {
        int a=12,b=0,c;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Zero divison error");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        int arr[]=new int[]{1,2,3,4,5,6,7,89};
        try
        {
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Final block");
        }
       


       
    }
}
