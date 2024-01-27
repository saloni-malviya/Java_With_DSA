/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Basic Function Call.......................
package apna_college;
import java.util.*;
public class Function1 {
    public static void printHello()
    {
        System.out.println("Hello World");
        return;
    }
    public static void calSum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
         System.out.println("Enter second number");
        int b=sc.nextInt();
        int sum=a+b;
         System.out.println("Sum of two number is:"+sum);
        
        return;
        
    }
    public static void main(String[]args)
    {
        printHello();           //function call
        calSum();
    }
    
}
