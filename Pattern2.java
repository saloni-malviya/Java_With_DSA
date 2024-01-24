/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............Print this pattern....................
//                    ****
//                    ***
//                    **
//                    *
package apna_college;


public class Pattern2 {
    public static void main(String[]args)
    {
        int n=4;
        for(int line=1;line<=n;line++)
        {
            for(int star=1;star<=n-line+1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
