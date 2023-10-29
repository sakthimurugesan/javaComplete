
// You are using Java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int n = n1.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int data = n1.nextInt();
            list.add(data);
        }
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            System.out.println(list);
            i++;
            j--;
        }
    }
}
