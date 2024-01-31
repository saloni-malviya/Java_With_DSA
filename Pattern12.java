/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................................RHOMBUS HOLLOW PATTERN...................................
//                                          *****
//                                         *   * 
//                                        *   *
//                                       *   *
//                                      *****
package apna_college;

public class Pattern12 {
    public static void rhHollow(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //Stars and Hollow
            //we use similar to rectangle hollow pattern code
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        rhHollow(7);
    }
}
