package lab5;
import java.util.Scanner;
public class q3 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your account: ");
        int accNum = s.nextInt();
        System.out.print("Enter acc type (s for saving, c for checking) : " );
        char accType = s.next().charAt(0);
        System.out.print("Enter minimum balance : RM ");
        double minBalance = s.nextDouble();
        System.out.print("ENter current balance : RM ");
        double currentBalance = s.nextDouble();
        double balance = currentBalance;
        if (accType == 's' ){
            if (currentBalance > minBalance) {
                balance = balance + ( currentBalance * 0.04); 
            } else {
                balance = balance - 10.00; }
        } else if (accType == 'C' ) {
            if (currentBalance < minBalance) {
                if (currentBalance <= (minBalance + 5000)) {
                    balance = balance + (currentBalance * 0.03); 
                } else {
                    balance = balance + currentBalance * 0.05;}
            } else {
                balance = balance - 25.00; }
        } else {
            System.out.println("Invalid account type");}
        
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Type: " + accType);
        System.out.printf("Current Balance: RM%.2f%n", currentBalance);
        System.out.printf("New Balance: RM%.2f%n", balance);
        }   
    }
    
