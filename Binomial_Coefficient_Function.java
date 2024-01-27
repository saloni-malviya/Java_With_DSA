/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......................Program to calculate Binomial Coefficient......................
package apna_college;

public class Binomial_Coefficient_Function {
     public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
     public static int binCoeff(int n,int r)
     {
         int n_fact = fact(n);
         int r_fact = fact(r);
         int nmr_fact = fact(n-r);
         int bincoff = n_fact/(r_fact*nmr_fact);
         return bincoff;
     }
    public static void main(String[]args)
    {

        int a=binCoeff(5,4);
        System.out.println("Binomial Coefficient is:"+a);
    }
}
