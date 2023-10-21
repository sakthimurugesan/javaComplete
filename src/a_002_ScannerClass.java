
/**
 * a_002_ScannerClass
 
Scanner class is used to get input from the user in java

Scanner in=new Scanner(System.in)
System.in means it get input from the keyboard

Scanner class function like 

        in.nextInt();   to get integer
        in.nextFloat(); to get float
        in.nextDouble(); to get double
        in.nextLong(); to get long
        in.nextBoolean(); to get boolean
        in.next(); to get one word
        in.nextShort(); to get short number
        in.nextByte(); to get byte number
        in.nextLine();  to get one entire line


 */
import java.util.Scanner;

public class a_002_ScannerClass {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer:");
        ;
        int i = in.nextInt();
        System.out.print("Enter a double:");
        ;
        double d = in.nextDouble();
        System.out.print("Enter a float:");
        ;
        float f = in.nextFloat();
        System.out.print("Enter a Character:");
        ;
        char c = in.next().charAt(0);
        System.out.println("INTEGER------------->" + i);
        System.out.println("DOUBLE-------------->" + d);
        System.out.println("FLOAT--------------->" + f);
        System.out.println("CHARATER------------>" + c);

    }
}