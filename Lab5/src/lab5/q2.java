package lab5;
import java.util.Scanner;

public class q2 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter sales: ");
        
        int sales = s.nextInt();
        int rate;
        if (sales < 10000){
            rate = 10;
        }else if (sales >10000 && sales <= 15000){
            rate = 15;
        }else
            rate = 20;
    
        int commission = (sales*rate)/100;
        
        System.out.println("Commission is : RM" + commission + "(Rate:" + rate + "%)") ;
        
    }
}
