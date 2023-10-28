import java.util.Scanner;

/**
 * a_037_array_of_object
 */
class exam_a_037
{

    int rollno;
    String name;
    int tamil;
    int english;
    int maths;
    int science;
    int social;
    int total;
    exam_a_037(int rollno,String name,int tamil,int english,int maths,int science,int social)
    {
        this.rollno=rollno;
        this.name=name;
        this.tamil=tamil;
        this.english=english;
        this.maths=maths;
        this.science=science;
        this.social=social;
        this.total=tamil+english+maths+science+social;
    }
}
public class a_037_array_of_object {

    public static void main(String[] args) {
        /*
        array of objects in java is just like creating a array of integers
        here an array of objects is created to access under same varible with index no

        syntax
        className variable[]=new className[size];

        eg
        let us consider an exam is conducted in school for three class A,B,C

        so you need get input for all students in three class and store

        A class contains 35 students
        B class contains 45 students
        C class contains 30 students

        in total it is 110 students
        it is impossible to create 110 object and access them individually

        so we can create array of objects and access them class-wise and rollno-wise

        you can access array-of-object with index number just like an array

        class A{
            int age;
        }
        A obj[]=new A[5];
        A[0].age=10;
        A[1].age=11;
        A[2].age=12;

        you can also create 2d array for an class in java

        className variable[][]=new className[row][col];

        you can access 2d array objects with row and col number
         */
    exam_a_037 A[]=new exam_a_037[35];
    exam_a_037 B[]=new exam_a_037[45];
    exam_a_037 C[]=new exam_a_037[30];
    // 2d array object

    Scanner in[][]=new Scanner[2][2];
    in[0][0]=new Scanner(System.in);

    }
}