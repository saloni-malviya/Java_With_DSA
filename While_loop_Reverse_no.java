/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........Program to print reverse no using while loop..............
package apna_college;

public class While_loop_Reverse_no {
    public static void main(String[]args)
    {
        int lastdigit;
        int n=543;
        while(n>0)
        {
            lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
           
        }
       
    }
}
