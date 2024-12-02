package lab6;
import java.util.Scanner;
public class q1 {

    public static void main(String[] args) {
        
        int integerNum = 0 ;
        int numberSum = 0 ;
        int countPositive = 0 ;
        int countNegative = 0 ;
        int count = 0;
        double average;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter integer number : ");
        integerNum = s.nextInt();
        
        while (integerNum !=0){
        if (integerNum > 0 ){
            countPositive = countPositive + 1;}
        else 
        {countNegative = countNegative + 1;}
        
        numberSum = numberSum + integerNum;
        count++;
    
        System.out.print("\nEnter integer number : ");
        integerNum = s.nextInt();
        
        average = numberSum/count;
        System.out.println("total number positive: " + countPositive);
        System.out.println("total number negative: " + countNegative);
        System.out.println("total from all integer number: " + numberSum);
        System.out.println("average :" + average);
        break;
        
        }
}
}