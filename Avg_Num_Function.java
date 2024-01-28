/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............Write a Java method to compute the average of three numbers.....................
package apna_college;
import java.util.*;
public class Avg_Num_Function {
    public static int avgNum(int a,int b,int c)
    {
        int sum=a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int x=sc.nextInt();
        System.out.println("Enter Second Number:");
        int y=sc.nextInt();
        System.out.println("Enter third number:");
        int z=sc.nextInt();
        int average=avgNum(x,y,z);
        System.out.println("the average of three number is:"+average);
    }
    
}
