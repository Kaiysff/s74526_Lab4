package lab6;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        int first,second;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter first integer:");
            first = input.nextInt();
            System.out.println("Enter second integer:");
            second = input.nextInt();
            if (first >= second)
            System.out.println("Error! First number must be less than second number.");
        }while (first >= second);
           System.out.println("Odd number between "+first+" and "+second+" number"); 
           int testNumber = first;
           while(testNumber <= second){
           if(testNumber%2 != 0){
           System.out.println(" "+testNumber);
           }
           testNumber++;
           }
            System.out.println("Even number between "+first+" and "+second+" number"); 
           testNumber = first;
           while(testNumber <= second){
           if(testNumber%2 == 0){
           System.out.println(" "+testNumber);
           }
           testNumber++;
           }
    }
    
}