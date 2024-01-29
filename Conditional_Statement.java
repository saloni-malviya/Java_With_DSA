/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//..............If else statement..................
package apna_college;

public class Conditional_Statement {
    public static void main(String[]args)
    {
        int age=20;
        if(age>18)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("not adult");
        }
        
        //..............Else If statement
        int agee=16;
        if(agee>=18)
        {
            System.out.println("adult");
        }
        else if(agee<18 && agee>13)
        {
            System.out.println("teenager");
        }
        else
        {
            System.out.println("child");
        }
        
        //.............Ternary Operator....................
        int x=(5>3)?5:3;
        System.out.println(x);
        int num=4;
        String s=(num%2==0)?"even":"odd";
        System.out.println(s);
        
        
    }
    
}
