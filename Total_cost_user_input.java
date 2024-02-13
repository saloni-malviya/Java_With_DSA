/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

package apna_college;
import java.util.*;
public class Total_cost_user_input {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost of Pencil ");
        float A=sc.nextFloat();
        System.out.println("Enter cost of pen");
        float B=sc.nextFloat();
        System.out.println("Enter cost of eraser");
        float C=sc.nextFloat();
        
        float total_cost=A+B+C;
        System.out.println("The total cost of these items is:"+total_cost);
        
        //add 18% tax
        float tax=total_cost+(0.18f*total_cost);
        System.out.println("Bill with 18% tax: "+tax);


    }
}
