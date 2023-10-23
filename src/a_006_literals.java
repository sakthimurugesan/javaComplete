/**
 * a_006_literals
 */
/*
    Literals in java are constants
    if we assign int x=5 
    the value will store value 5
    but where does the value 5 comes 
    the value 5 is the literal

    Types of literals
        1.Integer
        2.Floating numbers
        3.String
        4.Boolean
    
    Integer Literals
        Byte
        Short
        Int
        Long
        Any non floating numbers assigned to above data type are integer by default

        There is no problem when assigning value to int,short,byte

        but if we assign the long it will be problem

        try assign
        long l=9999999999999999999;

        It will show error like integer value limit excedded

        so you can do long l=9999999999999999999999L;
        if you specify L it means it is a long literals

        we can also represent integer in form of binary,octal,hexa decimal
            binary with 0b preceding
            octal with 0 preceding
            hexadecimal with 0x preceding

    Floating Literal
        float
        double
        are the floating point literal

        any floating point value assigned to float will be default double

        you can specify float f=2.35006f;
        here f specify float

        like wise you specfiy double

        double d=2.65366d;

    String
        Stirng are stored in pool
        




 */
public class a_006_literals {
public static void main(String[] args) {
   int a=10_000_10;
   double d=102_21.0_00;
   float f=102_21.12_52f;
   double l=1000e5;
}
    
}