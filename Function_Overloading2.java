/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Function Overloading using Data types........................
//............Program to calculate sum of 2 integer and floating numbers...........................
package apna_college;

public class Function_Overloading2 {
     public static int sum(int a,int b)
    {
        return a+b;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String[]args)
    {
        System.out.println("sum of two integer no is:"+sum(2,3));
        System.out.println("sum of two floating no is:"+sum(3.5f,3.8f));
    }


}
