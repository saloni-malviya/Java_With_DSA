/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..................Function with return the value...........................
//...............Program to calculate sum of two numbers.............................
package apna_college;
import java.util.Scanner;

public class Function3 {
    public static int calculateSum(int a,int b)     //Formal Parameter
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        int sum=calculateSum(x,y);                //Actual Parameter
        System.out.println("Sum of two number is:"+sum);
    }
}
