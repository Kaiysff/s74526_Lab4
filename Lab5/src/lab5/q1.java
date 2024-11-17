package lab5;

import javax.swing.JOptionPane;

public class q1 {

    public static void main(String[] args) {
        
        int currentYear = 2024;
        
        String s = JOptionPane.showInputDialog("Enter the ic number : ");
        
        String yearPart = s.substring(0,2);
        String monthPart = s.substring(2,4);
        String dayPart = s.substring(4,6);
        
        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        
        if ( birthYear <= 24){
            birthYear += 2000;
        }else if (birthYear >24 ){
            birthYear += 1900;
        }else
            System.out.println("The ic number is invalid");
        
        
        int age = currentYear - birthYear;
        String message = String.format("Birth date is %02d-%02d-%d\n Age is %d", day,month,birthYear,age);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
