/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............................Print this pattern........................
//                                 12345
//                                 1234
//                                 123
//                                 12
//                                 1
package apna_college;

public class Pattern8 {
    public static void Num_Pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Num_Pattern(5);
    }
}
