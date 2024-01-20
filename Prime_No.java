/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............Program to check if a number is prime or not...................
package apna_college;
import java.util.*;

public class Prime_No {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println(n+" is prime");
        }
        else
                
        {
             boolean isPrime=true;
            for(int i=2;i<n-1;i++)
            {
               // boolean isPrime=true;
                if(n%i==0)
                {
                    isPrime=false;
                }
                
            }
            if(isPrime==true)
            {
                System.out.println(n+"is prime");
            }
            else
            {
                System.out.println(n+"is not prime");
            }
        }
        
    }
    
}
