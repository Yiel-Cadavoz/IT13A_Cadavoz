/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2_Act2_JavaProgram {
    public static void main(String [] args){
       int x, y, z;
       
       Scanner in = new Scanner(System.in);
       
       System.out.println("Input the 1st number: ");
       x = in.nextInt();
       System.out.println("Input the 2nd number: ");
       y = in.nextInt();
       System.out.println("Input the 3rd number: ");
       z = in.nextInt();
       
       if (x > y && x > z){
           System.out.println("x is the greatest number");
       } else if (y > x && y > z){
           System.out.println("y is the greatest number");
       } else if (z > y && z > x){
           System.out.print("z is the greatest number");
       }
       
       
        
    }
    
}
