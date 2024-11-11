/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4q6 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value x1 : ");
        double x1 = s.nextDouble();
        System.out.print("Enter value x2 : ");
        double x2 = s.nextDouble();
        System.out.print("Enter value x3 : ");
        double x3 = s.nextDouble();
        
        double m = (x1+x2+x3)/3;
        double v = (Math.pow(x1-m,2)+Math.pow(x2-m,2)+Math.pow(x3-m,2))/3;
        double sd = (Math.sqrt(v));
      
        System.out.printf("Mean :  %.2f\n"  ,m);
        System.out.printf("Variance : %.2f\n" ,v);
        System.out.printf("Standard Deviation : %.2f\n" , sd);
    }
}
