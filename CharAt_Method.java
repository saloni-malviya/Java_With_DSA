/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// The charAt method return the character at the specified index.......
package apna_college;

public class CharAt_Method {
    //If we want to print all letters than we write a function :-
    public static void printletter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        String s1="Saloni";
        printletter(s1);
        System.out.println(s1.charAt(3));
    }
    
}
