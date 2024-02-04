package basic;

class a_060_join_sleep_1 extends Thread{
    String s;
    a_060_join_sleep_1(String s)
    {
        this.s=s;
    }
     @Override
     public void run()
     {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            try {
                sleep(500);
            } catch (Exception e) {
               
            }
        }
     }
}
/*
 @author sakthi
 */

class a_060_join_sleep {

    public static void main(String[] args) {
        a_060_join_sleep_1 obj=new a_060_join_sleep_1("Hello ");
        a_060_join_sleep_1 obj1=new a_060_join_sleep_1("World");
        obj.start();
        try {
            obj.join(500);
        } catch (Exception e) {
            
        }
        obj1.start();
    }
    
}