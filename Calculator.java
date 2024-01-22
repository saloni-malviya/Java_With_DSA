/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;
public class Calculator {
    public static void main(String[]args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        System.out.println("Enter Operator:");
        char op=sc.next().charAt(0);
        
        switch(op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
            case '/':
                System.out.println(a/b);
            case '%':
                System.out.println(a%b);
            default:
                System.out.println("Wrong input!!");
        }
    }
}
