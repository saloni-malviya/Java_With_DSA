/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Write a method named isEven that accepts an int argument. The method should return true 
//if the argument is even, or false otherwise.
package apna_college;

public class Even_odd_Function {
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        System.out.println(isEven(6));
    }
}
