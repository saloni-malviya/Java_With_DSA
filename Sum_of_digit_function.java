/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............Write a Java method to compute the sum of the digits in an integer.
package apna_college;

public class Sum_of_digit_function {
    public static void sum_dgt(int n)
    {
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println("The given digit is "+temp);
        System.out.println("The sum of given digit is:"+sum);
        
    }
    public static void main(String[]args)
    {
        sum_dgt(56);
    }
    
}
