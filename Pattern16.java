/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......................................NUMBER PYRAMID........................................package apna_college;
//                                             1
//                                            1 2
//                                           1 2 3
//                                          1 2 3 4
//                                         1 2 3 4 5
package apna_college;

public class Pattern16 {

    public static void numPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //for space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //for number
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 public static void main(String[]args)
 {
     numPyramid(6);
 }
}
    

