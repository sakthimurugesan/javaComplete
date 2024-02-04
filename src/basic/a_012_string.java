package basic;

import java.util.Scanner;

/**
 * a_012_string
 */
public class a_012_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String s="ABCDEF";
        // Different ways of recreating string
        byte bArray[]={65,66,67,68,69,70};

        // using constructor
        String s1=new String("ABCDEF");

        // using byte array

        String s2=new String(bArray);

        // using char array

        char cArray[]={'A','B','C','D','E','F'};

        String s3=new String(cArray);

        // s and s1 will not be equal
        // because s is stored in stack s1 is stored in heap memory
        // but the value ABCDEF will be stored in pool

    }
    
}