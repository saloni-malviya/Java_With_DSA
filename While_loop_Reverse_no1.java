/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................Program to reverse the given number using while loop...........
package apna_college;


public class While_loop_Reverse_no1 {
    public static void main(String[]args)
    {
        int rev=0;
        int n=3456;
        while(n>0)
        {
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        System.out.print("the reverse no is:");
        System.out.println(rev);
    }
}
