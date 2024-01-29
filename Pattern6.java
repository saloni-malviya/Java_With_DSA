/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........................Print the Hollow pattern............................    
//                         * * * * *
//                         *       *
//                         *       *
//                         * * * * *
//
package apna_college;

public class Pattern6 {
    public static void hollow(int n,int m)         //n=total_row,  m=total_column
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || i==n || j==1 || j==m)
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
        hollow(4,5);
    }
}
