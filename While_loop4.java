/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Program to print sum of first n natural numbers using while loop............
package apna_college;
import java.util.*;

public class While_loop4 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which to want to sum:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of n natural numbers is:"+sum);
    }
}
