/**
 * a_011_printf
 */
public class a_011_printf {

    public static void main(String[] args) {
        int a=10,b=-10;
        double d=1236478.096d;
        float f=123.654f;
        char c='A';
        String s="Hello world";
        System.out.printf("%1$d\t%2$d\t%1$d\n",  a,b);
        System.out.printf("1234567890\n");
      System.out.printf("%g",d);

    }
}
/*
 format specifier
%[arguement_index$][flags][width][.precision][conversion]

arguement_index
s.o.printf("%d %d %d",x,y,x);

here in the above example we want to print x two time so we are passing x two

instead of the we can use arguement_index we can simply pass the index
System.out.printf("%1$d\t%2$d\t%1$d",  x,y);
here x is in index 1
     y is in index 2

     % follwed by index $ symbol and conversion format


flags 
flags are symbols are that is used to display in the output inside printf
+
-
0
(
' '

width length includes that flags

for postive integer if we use - it will not show - in output
for postive integer if we use + it will  show + in output after few spaces based on width
for postive integer if we use 0 it will  show 0 in output based on width
for postive integer if we use ( it will show spaces in output based on width

for negative integer if we use + it will not show - in output but it show output with few spaces based on width
for postive integer if we use - it will  show - in output but not include space
for negative integer if we use ( it will show () before and after digit spaces based on width
for negative integer if we use 0 it will  show 0 in output based on width

width

width is used to set limit for output that display to be printed on screen
width length includes that flags

conversion

string s
integer d,o,x
o-octal
x-hexadecimal
float f,e,g


 */