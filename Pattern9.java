/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................................Print this patten
//                                  1
//                                  01
//                                  101
//                                  0101
//                                  10101
package apna_college;

public class Pattern9 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        pattern(5);
    }
}
