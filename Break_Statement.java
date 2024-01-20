/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Program to keep entering numbers till user enters a multiple of 10..........
package apna_college;
import java.util.*;

public class Break_Statement {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       do{
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(n%10==0)
        {
            break;
        }
        System.out.println(n);
       }while(true);
        }        
    }

