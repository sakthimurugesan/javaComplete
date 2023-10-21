import java.util.Scanner;

/**
 * a_003_ScannerCLassFunctions
 * Scanner class is used to get input from the user in java
 * 
 * Scanner in=new Scanner(System.in)
 * System.in means it get input from the keyboard
 * 
 * Scanner class function like
 * 
 * in.nextInt(); to get integer
 * in.nextFloat(); to get float
 * in.nextDouble(); to get double
 * in.nextLong(); to get long
 * in.nextBoolean(); to get boolean
 * in.next(); to get one word
 * in.nextLine(); to get one entire line
 * 
 * 
 * in.hasNextInt(); to check next input is integer
 * in.hasNextFloat(); to check next input is float
 * in.hasNextDouble(); to check next input is float
 * in.hasNext(); to check next input is word
 * in.hasNextShort(); to check next input is short
 * in.hasNextByte(); to check next input is byte
 * in.hasNextBoolean(); to check next input is boolean
 * in.hasNextLine(); to check next input is string means entire line
 * 
 * 
 */
public class a_003_ScannerCLassFunctions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int a = in.nextInt();
        System.out.print("Enter an float : ");
        float d=in.nextFloat();
        System.out.print("Enter an float the hasNextInt will print false now\t\t");
        System.out.print(in.hasNextInt());


        
    }
}