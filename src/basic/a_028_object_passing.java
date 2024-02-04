package basic;

/**
 * a_028_object_passing
 */
public class a_028_object_passing {

    public static void changeValue(int arr[],int var)
    {
        var++;
        arr[0]=25;
        System.out.println("var inside changeValue function : "+var);
        System.out.println("arr[0] inside changeValue function : "+arr[0]);
    }
    public static void main(String[] args) {
        /*
        object passing in java is like passing normal arguements to methods
        but if we pass an arguement to a method and if any changes made to will
        also reflect outside a method
        
        if we pass variables like int a,int b to method and the values changed inside the method will not reflect outside it

        but if we pass an object like array,class object,scanner object to a method 
        any changes made inside will also reflect outside the method

         */
        int arr[]=new int[]{1,2,3,4,5};
        int var=10;
        System.out.println("Before calling changeValue function");
         System.out.println("var outside changeValue function : "+var);
        System.out.println("arr[0] outside changeValue function : "+arr[0]);
        System.out.println("");
        
        changeValue(arr, var);

        System.out.println("");

        System.out.println("After calling changeValue function");
        System.out.println("var outside changeValue function : "+var);
        System.out.println("arr[0] outside changeValue function : "+arr[0]);
    }
}