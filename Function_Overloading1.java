/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Function Overloading using Parameters........................
//............Program to calculate sum of 2 and 3 numbers.....................
package apna_college;

public class Function_Overloading1 {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[]args)
    {
        System.out.println("sum of two no is:"+sum(2,3));
        System.out.println("sum of three no is:"+sum(3,4,5));
    }
}
