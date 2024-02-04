package basic;

/**
 * a_026_methods
 */
public class a_026_methods {

    public int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        /*
         methods in java are functions
         in java we call it as methds not as functions

         methods helps to reduces codes and provide much better modularity
         once a method is defined it can be many it times in a program

         syntax

         public/private/protected return_type methodName ([parameter])
        {
            method block
            return statement
        }

        access_modifer are public,private,protected

        public can be access anywhere in the program using object

        private can be access only in the class using this keyword

        protected is nothing but private in that class but derived class can also access it
        where private cannot be accessed in derived class

        return_types
            are nothing but what data type it is returning 
            it may be int,long,float,double,char,string,boolean
            void is also return type but not datatype
            void returns nothing it just terminate
        
        one function will return only one object

        parameters are optional based on function defintions

        methods can be accessed using objects of the class

        while calling functions we use ()
        obj.method()
         */

         a_026_methods obj=new a_026_methods();
         System.out.println(obj.add(15, 15));
    }
}