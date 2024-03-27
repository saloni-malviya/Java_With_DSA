/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// find out the given string is palindrome or not..................
package apna_college;

public class Palindrome_String {
    public static boolean palindrome_String(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                System.out.println(str+" is not palindrome");
                return false;
            }
        }
        System.out.println(str+" is palindrome");
        return true;
    }
    public static void main(String[]args)
    {
        String str="racecar";
        palindrome_String(str);
    }
}
