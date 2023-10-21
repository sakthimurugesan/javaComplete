import java.util.*;
import java.util.Calendar;
import java.util.regex.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String a="^[7-9]\\d{9}";
if(Pattern.matches(a,s))
{
System.out.println(s+" :Valid Number");
}
else
{
System.out.println(s+" :Invalid Number");
}
}
}