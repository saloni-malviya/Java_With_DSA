/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................Program to print 1 to n numbers using while loop................
package apna_college;
import java.util.Scanner;
public class While_loop3 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number which you want to print");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}
