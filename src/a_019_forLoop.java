/**
 * a_019_forLoop
 for loop is most simple loop in all languages
for-loop  is used to run the iterations for given number of times
 for(initialization;condition;increment/decrement)

 if the variable is declared outside it should not be declared once again in loop

if the variable is declared outside there is no need to declare in loop we skip that part
and also we mention the increment/decrement part anywhere in body of loop

but we need to mention the condition inside the for part
 */
public class a_019_forLoop {
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<10 && i!=9;i++)
        {
            System.out.println("i "+i);
        }
        System.out.println(" ");
        for(int j=0,k=1;j<10 && k<11;k++,j++)
        {
            System.out.println(j+" "+k);
        }
    }
    
}