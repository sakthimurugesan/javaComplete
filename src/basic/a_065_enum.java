package basic;

enum Dept
{
    CS,MECH,CIVIL,MCT,ECE,EEE;
    private Dept()
    {
        System.out.println(this.name()+" "+this.ordinal());
        //this will print all the values of the enum
    }
}
enum Dept1
{
    CS("BLOCK-A","Joe"),MECH("BLOCK-B","John"),CIVIL("BLOCK-C","Mike"),MCT("BLOCK-D","Thiru"),ECE("BLOCK-E","Henry"),EEE("BLOCK-F","Stark");

    String loc,head;

    private Dept1(String loc,String head)
    {
        this.head=head;
        this.loc=loc;   
    }
    private String getLocation()
    {
        return loc;
    }
    private String getHead()
    {
        return head;
    }

}
// enum creation
class a_065_enum
{
    public static void main(String[] args) {
         Dept d=Dept.CIVIL;
         System.out.println(Dept.valueOf("ECE"));
         Dept list[]=Dept.values();
         for (Dept dept : list) {
            System.out.println(dept);
         }
         System.out.println(d.ordinal());
         // index of the value in enum

         Dept1 d1=Dept1.CIVIL;
         System.out.println(d1.head);
         System.out.println(d1.loc);
    }
}