package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class a_056_try_resource {
    public static void try_resource() throws IOException
    {
        try (FileReader fr=new FileReader("java.txt")) {
            Scanner in=new Scanner(fr);
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        } 
        finally
        {
            System.out.println("FileClosed");
        }
    }
    public static void main(String[] args) {
        try {
            try_resource();
        } catch (Exception e) {
            System.out.println("FileClosed");
            System.out.println(e.getMessage());
        }
    }
}
