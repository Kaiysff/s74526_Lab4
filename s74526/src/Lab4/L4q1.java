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
public class L4q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = s.nextInt();
        System.out.println("Enter second integer");
        int num2 = s.nextInt();
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sumSquare = square1 + square2;
        int diffSquare = square1 - square2;
        System.out.println();
        System.out.println("The square of " + num1 + " is = " + square1);
        System.out.println("The square of " + num2 + " is = " +square2);
        System.out.println("The sum of the square is = " + sumSquare);
        System.out.println("The different of the square is = " + diffSquare);
    }
}
