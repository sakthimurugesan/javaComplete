package basic;

import java.util.Scanner;

public class a_063_Wrapper_Class {

    public static void main(String[] args) {
        /*
         * int float double long boolean char byte short
         */

        // object creation

        Integer obj = Integer.valueOf(5); // boxing
        obj = Integer.valueOf("5");

        // depricated
        // Integer obj1=new Integer(5);
        // Integer obj2=new Integer("5");

        int i = obj.intValue(); // unboxing
        i = obj; // auto-unboxing

        Integer obj1 = 15; // autoboxing

        Float f = 15.5f;
        Byte b = obj.byteValue();
        Short s = 125;
        Character c='a';
        Double d=Math.sqrt(-25);
        System.out.println(d);
        System.out.println(Double.NaN!=d);
       
    }
}
