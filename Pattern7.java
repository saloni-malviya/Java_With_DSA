/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........................Print this pattern
//                                       *
//                                      **
//                                     ***
//                                    ****

package apna_college;

public class Pattern7 {
    public static void Pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Pattern(4);
    }
}
