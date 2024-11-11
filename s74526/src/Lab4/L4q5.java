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
public class L4q5 {
     public static void main(String[] args){
        
        String s = JOptionPane.showInputDialog("Enter Disstance in meter : ");
        double m = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Enter time in hour : ");
        double h = Double.parseDouble(s);
                
        s = JOptionPane.showInputDialog("Enter time in minutes : ");
        double mnt = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Enter time in second : ");
        double sec = Double.parseDouble(s);
        //convert hour to second
        // 1 hour = 60 minit  , 1 minit = 60 saat
        // 60 minit = 3600 saat
        double second = (h*3600) + (mnt*60) + sec;
        double km = m/1000;
        double mile = m/1609;
        double hour = h + (mnt/60) + (sec/3600);
        
        double mps = m/second;
        double kmph = km/hour;
        double mph = mile/hour;
        
        String message = String.format("Speed : ")+
                        String.format("\nMeter per second : %.2f ", mps )+
                        String.format("\nKilometer per hour : %.2f ", kmph )+
                        String.format("\nMile per hour : %.2f ", mph );
      
       JOptionPane.showMessageDialog(null, message);
    }
}
