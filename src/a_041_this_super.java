/**
 * a_041_this_super
 */
 class demo_a041
 {
    public int age;
    public String name;
    demo_a041(int age,String name)
    {
      System.out.println("Constructor of super class called");
      this.age=age;
      this.name=name;
    }
    void display()
    {
      System.out.println("age : "+age+" name : "+name); // both will print the same result
      System.out.println("age : "+this.age+" name : "+this.name);
      
    }
    
 }

 class demo2_a041 extends demo_a041
 {
    public int marks;
    public String name;
    demo2_a041(int marks,int age,String name1,String name2)
    {
      super(age,name1);
      System.out.println("Constructor of child class called");
      this.marks=marks;
      this.name=name2;
      System.out.println("Super class display method called");
      super.display();
      System.out.println("Subclass class display method called");
      this.display();
    }
    void display()
    {
      System.out.println("marks : "+marks+" name : "+name); // both will print the same result
      System.out.println("marks : "+this.marks+" name : "+this.name);
    }

 }
public class a_041_this_super {
/*
  this keyword is used to access the variable and methods of that class
  when it is a child class this keyword can also access the base class methods and variables
  one other use of this keyword we can use this function to assign value
  when using constructor we will use different identifer for constructor arguements to assign value for class variable

  if we use this keyword to assign value we can give same name as class variable for identifer
  this() can call differnet constructor of same class 

  but there is an issue that when both classes have same variable or same method name 
  to solve this issue we can use super keyword

  we can use super keyword to access method and variable of superclass
  one other advantage of super keyword is it can be useful to parametermized constructor of super-class
  when we create an object for the subclass it will call the default constructor of parent but using 
  super-keyword we call parameterized constructor of super class

 */

public static void main(String[] args) {
   System.out.println("Object created for child class");
  demo2_a041 obj=new demo2_a041(0, 0, "Sakthi", " Murugesan");
}
    
}