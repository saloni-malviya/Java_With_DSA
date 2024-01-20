/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............Program to display all numbers entered by user except multiple of 10..........
package apna_college;
import java.util.*;
public class Continue_Statement {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter user number");
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
