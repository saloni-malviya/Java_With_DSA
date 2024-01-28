/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...................Program to convert binary to decimal number.........................
package apna_college;

public class Binary_to_Decimal_function {
    public static void BtoD(int n)
    {
        //pow=power, Dec=Decimal, LD=Last Digit;
        int pow=0;
        int Mynum=n;
        int Dec=0;
        //int LD=n%10;
        while(n>0)
        {
            int LD=n%10;
            Dec=Dec+(LD*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of "+Mynum+" is = "+Dec);
    }
    public static void main(String[]args)
    {
        BtoD(100);
        BtoD(111);
        
        
        
    }
}
