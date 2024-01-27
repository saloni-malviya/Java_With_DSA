/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Program to check if a number is prime or not.......................
package apna_college;

public class Prime_no_Function {
    public static boolean primeno(int n)
    {
        boolean isPrime=true;
        if(n==2)
        {
            return isPrime;
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return isPrime;
    }
    //..................Optimized Approach...........................
    public static boolean primeno1(int n)
    {
        boolean isPrime=true;
        if(n==2)
        {
            return isPrime;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return isPrime;
    }
    public static void main(String[]args)
    {
        System.out.println(primeno(17));
         System.out.println(primeno1(18));
        
    }
}
