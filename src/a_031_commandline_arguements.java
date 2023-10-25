/**
 * a_031_commandline_arguements
 */
public class a_031_commandline_arguements {

    public static void main(String[] s) {
        /*
        commandline arguements are arguements which are passed in termimal along with java command

        eg java Main.java hello world
        in the above commnad 
        java-keyword to run java file
        Main.java file name

        hello
        world are the arguements which are passed along the command
        these arguements are stored in String args[] in the main() method

        by default most people use args[] but instead you can give your own identifier
         */
        System.out.println(s[0]+"\t\t"+s[1]);
    }
}