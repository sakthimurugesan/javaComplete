package basic;

/**
 * a_007_operators
 */
public class a_007_operators {
/*
 increament and decrement
 ++a,a++,--a,a--
 preincreament,postincreament,predecreament,postdecreament


 arithmetic 

 + addition
 -  subtraction
 *  multiplication
 /  divison
 %  modulos


 assingment

 += perform addition and assign value
 -= perform subtraction and assign value
 *= perform multiplication and assign value
 /= perform divison and assign value
 %= perform modulos and assign value


 java has also use % operator for float and double
bitwise

&   bitwise and
|   bitwise or
~   bitwise not
^   bitwise xor exclusive
<<   bitwise left shift
>>   bitwise right shift


Relational operator
> greater than
>= greater than or equal
< less than
<= less than or equal
!= not equal
== equal to


logical

&& logical and
|| logical or
! logical not


Logical operator are used to evaluate conditions

and operator will return true if both conditions are true
or operator will return true if any one conditions are true
not operator will return inverse of the truth value

Increament and decrement operator

it can add or subtract only one value

x++ postincreament 
means it will first assign the value to a new variable then it will update x

for eg

x=5
y=x++

now value of y will be 5
now value of x will be 6


++x preincreament

means it will first update the value and assign the value to a new variable

for eg

x=5
y=++x

now value of y will be 6
now value of x will be 6

x-- postincreament

means it will first assign the value to a new variable then it will update x

for eg

x=5
y=x--

now value of y will be 5
now value of x will be 4


--x preincreament

means it will first update the value and assign the value to a new variable

for eg

x=5
y=--x

now value of y will be 4
now value of x will be 4

 */

public static void main(String[] args) {
    System.out.print("Arithmetic operator\n");
    System.out.println("5+3\t"+(5+3));
    System.out.println("5-3\t"+(5-3));
    System.out.println("5*3\t"+(5*3));
    System.out.println("15/3\t"+(15/3));
    System.out.println("15%2\t"+(15%2));
    System.out.println("15.5%2.5\t"+(float)((15.5%2.5)));
    System.out.println("15.3/2.5\t"+(float)((15.3/2.5)));


    int x=5;
    System.out.print("\n\nAssignment operator\n");
    System.out.print("x=5\n");
    System.out.println("x+=4\tx="+(x+=4));
    System.out.println("x-=4\tx="+(x-=4));
    System.out.println("x*=4\tx="+(x*=4));
    System.out.println("x/=2\tx="+(x/=2));
    System.out.println("x%=7\tx="+(x%=7));

    System.out.print("\n\nIncreament or decreament operator\n");
    x=5;int y;
    System.out.println(" x=5;int y;");
    y=x++;
    System.out.println("y=x++\ty="+y+"\tx="+x);
    x=5;
    System.out.println(" x=5");
    y=++x;
    System.out.println("y=++x\ty="+y+"\tx="+x);

   
    x=5;
    System.out.println(" x=5");
    y=x--;
    System.out.println("y=x--\ty="+y+"\tx="+x);
    x=5;
    System.out.println(" x=5");
    y=--x;
    System.out.println("y=--x\ty="+y+"\tx="+x);

    x=5;
    y=4;
    int z=6;
    
    char c='A';
    int s=c+x;

    // if you try to add char,int and store in char it will show error
}

}