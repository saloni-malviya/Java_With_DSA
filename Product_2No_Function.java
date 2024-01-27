/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................Program to calculate Product of two numbers...........................
package apna_college;

public class Product_2No_Function {
    public static int product(int a,int b)
    {
        int prod=a*b;
        return prod;
    }
    public static void main(String[]args)
    {
        int x=5;
        int y=8;
        int multiply=product(x,y);
        System.out.println("Product of "+x+"*"+y+ " is:"+multiply);
        multiply=product(3,4);
        System.out.println("Product of two no is:"+multiply);
    }
}
