/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............................DIAMOND PATTERN..............................
//                                      *
//                                     ***
//                                    *****
//                                   *******
//                                  *********
//                                  *********
//                                   *******
//                                    *****
//                                     ***
//                                      *
package apna_college;

public class Pattern13 {
    public static void diamond(int n)
    { 
        //outer loop first half
        for(int i=1;i<=n;i++)
        {
            //inner loop for Space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for star
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop 2nd half
        for(int i=n;i>=1;i--)
        {
            //for spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        diamond(5);
    }
}
