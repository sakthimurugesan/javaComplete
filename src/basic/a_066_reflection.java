package basic;

import java.lang.reflect.*;

class DemoReflect {
  public  String nameString;
  public  int age;
    double salary;

    DemoReflect() {

    }

    public DemoReflect(String nameString, int age, double salary) {
        this.nameString = nameString;
        this.age = age;
        this.salary = salary;
    }

    public DemoReflect(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class a_066_reflection {
    public static void main(String[] args) {
        Class c = DemoReflect.class;
        Field field[] = c.getDeclaredFields(); // getting variables
        for (Field field2 : field) {
            System.out.println(field2);
        }
       System.out.println(field.length);
        Constructor cons[] = c.getConstructors(); // getting constructors
        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }
        Method meth[] = c.getMethods(); //getting methods
        for (Method method : meth) {
            System.out.println(method);
        }
        DemoReflect obj=new DemoReflect(12,12);
        c=obj.getClass(); // getting values based on object
        System.out.println(c.getName()); // class name

        Field field2[]=c.getFields(); // getfirld will return only public field
        for (Field field3 : field2) {
            System.out.println(field3);
        }
    }
}
