/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;
public class Positive_neg {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int a=sc.nextInt();
        if(a>=0)
        {
            System.out.println(a+" is positive number");
        }
        else
        {
            System.out.println(a+" is negative number");
        }
    }
}
