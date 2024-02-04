package basic;

/*
 monitor is a concept of one thread only using one object at a time
 two thread cannot access a same object at same time
 only if first thread completes the process then second thread can come in access
 */
class Data {
    public String s;

    Data(String s) {
        this.s = s;
    }
}

class DisplayThread extends Thread {
    Data d;

    DisplayThread(Data d) {
        this.d = d;
    }

   synchronized public void run() {
        for (int i = 0; i < d.s.length(); i++) {
            System.out.print(d.s.charAt(i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println();
    }
}

public class a_061_monitor {
    public static void main(String[] args) {
        Data d = new Data("Hello world!!");
        DisplayThread obj = new DisplayThread(d);
        DisplayThread obj1 = new DisplayThread(d);
        obj.start();
        try {
            obj.join(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        obj1.start();
    }
}
