package basic;

interface a_046_1
{
    void display();
}

interface a_046_2
{
    void display2();
}

class multipleInheritanceDemo implements a_046_1,a_046_2
{
    public void display()
    {
        System.out.println("Hello fron Display 1");
    }
    public void display2()
    {
        System.out.println("Hello fron Display 2");
    }
}
class a_046_multiple_inheritance 
{
    public static void main(String[] args) {
        multipleInheritanceDemo obj=new multipleInheritanceDemo();
        obj.display();;
        obj.display2();

        a_046_1 obj2=obj;
        obj2.display();

        a_046_2 obj3=new multipleInheritanceDemo();
        obj3.display2();
    }
    

}