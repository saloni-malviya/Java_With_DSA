/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;

/**
 *
 * @author Onsite Solution
 */
public class Type_conversion {
    public static void main(String[]args)
    {
        int a=10;
        long b=a;
        System.out.println(b);
        //float c=25.0f;
        //int d=c;                   this is error occur because float is not convert int then we write
        float c=25.99f;
        int d=(int)c;
        System.out.println(d);
        //we can convert characters to number
        char ch='a';
        char ch2='b';
        int num=ch;
        int num2=ch2;
        System.out.println(num);
        System.out.println(num2);
    }
}
