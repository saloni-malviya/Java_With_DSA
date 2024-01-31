/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....................................RHOMBUS PATTERN................................
//                                          *****
//                                         *****
//                                        *****
//                                       *****
//                                      *****
package apna_college;

public class Pattern11 {
    public static void rhPattern(int n)
    {
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //inner loop for Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for Stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        rhPattern(6);
    }
}
