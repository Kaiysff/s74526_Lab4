/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class L4q2 {
    public static void main(String[] args) {
        
       final double PI = 3.14159;
       
       String s = JOptionPane.showInputDialog("Enter radius of a circle : ");
       double r = Double.parseDouble(s);
       
       double diameter = 2*r;
       double circumference = 2*PI*r;
       double area = PI*(Math.pow(r, 2));
       String message = String.format("\nDiameter : %.2f  ", diameter )+
                        String.format("\nCircumference: %.2f  ", circumference )+
                        String.format("\nArea : %.2f  ", area );
      
       JOptionPane.showMessageDialog(null, message);
       
    } 
}
