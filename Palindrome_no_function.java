/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Write a Java program to check if a number is a palindrome in Java?

package apna_college;

public class Palindrome_no_function {
    public static void palindrome(int n)
    {
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        if(rev==temp){
            System.out.println(temp+ " is palindrome number");
        }
        else
        {
            System.out.println(temp+ " is not palindrome number");
        }
        
    }
    
       public static void main(String[]args)
       {
           palindrome(121);
           palindrome(122);
       }
}
