/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Program to swapping of two numbers using function.....................
package apna_college;

public class Swap_No_Function {
    public static void swap(int a,int b)
    {
        int temp=a;
               a=b;
               b=temp;
               System.out.println("a="+a);
               System.out.println("b="+b);
               return;
    }
    public static void main(String[]args)
    {
        swap(5,8);
        
    }
}
