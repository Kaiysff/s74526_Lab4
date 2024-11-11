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
public class L4q4 {
    public static void main(String[] args){
        
        String s = JOptionPane.showInputDialog("Enter character : ");
        
        String r = s.toLowerCase();
        String w = s.toUpperCase();
        
        String m = String.format("RESULT: ")+
                   String.format("\nLOWERCASE : %s",r)+
                   String.format("\nUPPERCASE : %s",w);
        
        JOptionPane.showMessageDialog(null, m);
        
    }
}
