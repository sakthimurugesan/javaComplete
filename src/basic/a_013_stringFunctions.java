package basic;

/**
 * a_013_stringFunctions
 */
public class a_013_stringFunctions {
    public static void main(String[] args) {
        String s="AHELLO WORLD";
        String s1="MALAYALAM";
        System.out.println(s.charAt(0)); // to select the char at index
        System.out.println(s.compareTo(s1)); // to compare to string lexologically
        System.out.println(s.chars()); //
        System.out.println(s.concat(s1)); // to concat to strings
        System.out.println(s.contains("HELLO")); // will return true or false if the given string is present
        System.out.println(s.codePointAt(0)); // to return ascii code the given index
        System.out.println(s.codePointBefore(5)); // to return ascii code the given before index
        System.out.println(s.codePointCount(0,7));
        System.out.println(s.compareToIgnoreCase("hello")); // to compare to string irrespective of cases upper or lower
        System.out.println(s.contentEquals(s1));





    }
}