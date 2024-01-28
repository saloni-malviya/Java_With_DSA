/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........................Program to convert Decimal to Binary number......................
package apna_college;

public class Decimal_to_Binary_function {
    public static void DtoB(int n)
    {
        int pow=0;
        int Bin=0;
        int Mynum=n;
       // int rem=n%10;
        while(n>0)
        {
            int rem=n%2;
            Bin=Bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+Mynum+" is = "+Bin);
    }
    public static void main(String[]args)
    {
        DtoB(1);
        DtoB(2);
        DtoB(3);
        DtoB(4);
        DtoB(5);
        DtoB(6);
        DtoB(7);
    }
}
