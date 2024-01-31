/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......................PALINDROMIC PATTERNS WITH NUMBERS........................
//                                           1
//                                          212
//                                         32123
//                                        4321234
//                                       543212345
package apna_college;

public class Pattern15 {
    public static void palindromePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //for spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for numbers in decending order
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            //for numbers in ascending order
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        palindromePattern(5);
    }
}
