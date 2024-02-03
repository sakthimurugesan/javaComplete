import java.util.Scanner;
/*
 @author sakthi
 * */
import java.text.DecimalFormat;
class a_001_jdk_jvm_jre
{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        double branding=in.nextInt();
        double travel=in.nextInt();
        double food=in.nextInt();
        double logiscts=in.nextInt();
        double total=branding+travel+food+logiscts;
        System.out.println("Total expenses : Rs."+total);
        System.out.println("Branding expenses : Rs."+df.format(branding)+'%');
        System.out.println("Travel expenses percentage : "+df.format(travel));
        System.out.println("Food expenses percentage : "+df.format(food)+'%');
        System.out.println("Logistics expenses percentage : "+df.format(logiscts)+'%');
    }
}