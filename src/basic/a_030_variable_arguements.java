package basic;

/*
a_030_variable_arguements
*/
public class a_030_variable_arguements {

    public static int max(int a,int []b)
    {
        int m=Integer.MIN_VALUE;
        if(a>m)
        m=a;
        for(int c:b)
        if(c>m)
        m=c;
        return m;
    }
    public static void main(String[] args) {
        /*
        we had previously seen method overloading with different no of parameters
        for example we use maximum method to max of two numbers sometimes it may three,four etc
        it such case we cannot define same method for multiple times
        instead we can use variable arguements

        variable arguments is just like passing an array of elements of same type but there is an differnet while calling the methods

        syntax

        int max(int a,int ...b)
        here ...b is variable length arguement
        max(2,3,4,6,7,4,56,5,44,6,5,4)
        here 2 is assigned to a
        and remaining are assigned to b array

        here we can also call this method as max(2,array_variable)
        also like max(2,new int[]{3,4,6,7,4,56,5,44,6,5,4})

        we can also call max(2) it will not show any errors

        we can also declare using array int max(int a,int b[])
        call this method as max(2,new int[]{3,4,6,7,4,56,5,44,6,5,4})
        max(2,array_variable)
         we can call only this not as
        max(2,3,4,6,7,4,56,5,44,6,5,4) this is invalid

        max(2) this will show error
         */
        int arr[]={3,4,6,7,4,56,5,44,6,5,4};
        System.out.println(max(2,new int[]{3,4,6,7,4,56,5,44,6,5,4}));
    }
}