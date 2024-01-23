/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;

public class Income_tax_calculator {
    public static void main(String[]args)
    {
        int tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        int income=sc.nextInt();
        if(income<500000)
        {
             tax=0;
        }
        else if(income>=500000 && income<1000000)
        {
             tax=(int)(income*0.2);     //20%tax
        }
        else
        {
             tax=(int)(income*0.3);  //30% tax
        }
        System.out.println("Your tax is:"+tax);
    }
}
