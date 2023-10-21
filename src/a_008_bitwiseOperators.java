/**
 * a_008_bitwiseOperators
 */
/*
 
Bitwise operator are operator which take input and work on the bits on the number

bitwise

&   bitwise and
|   bitwise or
~   bitwise not
^   bitwise xor exclusive
<<   bitwise left shift
>>   bitwise right shift


&   bitwise and

It will take two numbers as input and convert into bits it will compare bits of two numbers
if both the bits are 1 it will return 1 else 0
and the final value is once again converted into number

4&5

4=>100
5=>101

1   0   0
1   0   1
--------------
1   0   0

output is 4


&   bitwise or

It will take two numbers as input and convert into bits it will compare bits of two numbers
if any one bit is 1 it will return 1 else 0
and the final value is once again converted into number

4|5

4=>100
5=>101

1   0   0
1   0   1
--------------
1   0   1

output is 5



  
 
 */
public class a_008_bitwiseOperators {
public static void main(String[] args) {
    int a=10,b=12;
    System.out.println("int a=10,b=12;");
    System.out.println("Bitwise and operator");
    System.out.println("a&b\t==>"+(a&b));
    System.out.println("Bitwise or operator");
    System.out.println("a|b\t==>"+(a|b));
    System.out.println("Bitwise exor operator");
    System.out.println("a^b\t==>"+(a^b));
    System.out.println("Bitwise not operator");
    System.out.println("~a\t==>"+(~a));
    System.out.println("Bitwise left shift operator");
    System.out.println("a<<2\t==>"+(a<<2));
    System.out.println("~a\t==>"+(~a));
    System.out.println("Bitwise right shift operator");
    System.out.println("a<<2\t==>"+(a>>2));

    // swapping can be done using exor operator
    System.out.println("a\t"+a);
    System.out.println("b\t"+b);
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a\t"+a);
    System.out.println("b\t"+b);
}
    
}