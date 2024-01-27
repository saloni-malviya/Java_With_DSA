/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......................function with Parameter.....................
//......Program to calculate sum of two numbers.................................
package apna_college;
import java.util.*;
public class Function2 {
    public static void calSum(int a,int b)       //Formal Parameter
    {
        int sum=a+b;
        System.out.println("Sum of two number is:"+sum);
        return;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();
        calSum(x,y);                      //Actual Parameter
    }
}
