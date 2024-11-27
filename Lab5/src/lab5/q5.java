package lab5;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        String custName, woodType, color;
        int numCharacters;
        double Price = 30.0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        custName = s.nextLine();
        System.out.print("Enter wood type (oaks/mahogany): ");
        woodType = s.nextLine();
        if (woodType.equals("oaks")) {
            Price = Price + 15.0;
        } else if (woodType.equals("mahogany")) {
            Price = Price + 10.0;}
        System.out.print("Enter character color (black/white/gold): ");
        color = s.nextLine();
        switch (color) {
            case "gold":
                Price = Price + 12.0;
                break;}
        System.out.print("Enter number of characters: ");
        numCharacters = s.nextInt();
        if (numCharacters > 6) {
            Price = Price + (numCharacters - 6 ) * 3.0;}
        System.out.println("\n");
        System.out.println("Customer Name: " + custName);
        System.out.println("Wood Type: " + woodType);
        System.out.println("Character Color: " + color);
        System.out.println("Number of Characters: " + numCharacters);
        System.out.println("Final Price: RM" + Price);
    }
}
