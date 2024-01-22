/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
//(Hint : Average of N numbers is sum of those numbers divided by N)
package apna_college;
import java.util.*;

public class Avg_num {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int A=sc.nextInt();
        System.out.println("Enter second number");
        int B=sc.nextInt();
        System.out.println("Enter third number");
        int C=sc.nextInt();
        int sum=A+B+C;
        int avg=sum/3;
        System.out.println("Average of these numbers are:"+avg);
        

    }
}
