package lab5;
import javax.swing.JOptionPane;
public class q4 {
    public static void main( String [] args){
        String s = JOptionPane.showInputDialog("Enter a date : ");
        String[] dateParts = s.contains("-") ? s.split("-") : s.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;}
        int k = year % 100; 
        int j = year / 100; 
        int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;
        if (h < 0) {
            h += 7;}
        String dayOfWeek;
        switch (h) {
            case 0: dayOfWeek= "Saturday"; break;
            case 1: dayOfWeek = "Sunday"; break;
            case 2: dayOfWeek = "Monday"; break;
            case 3: dayOfWeek = "Tuesday"; break;
            case 4: dayOfWeek = "Wednesday"; break;
            case 5: dayOfWeek = "Thursday"; break;
            case 6: dayOfWeek = "Friday"; break;
            default: dayOfWeek = "Invalid"; break;}
        JOptionPane.showMessageDialog(null, "The day of this week : " + dayOfWeek);
    }
}
    

