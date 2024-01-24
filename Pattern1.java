/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Print this pattern...............
//                  *
//                  **
//                  ***
//                  ****
package apna_college;


public class Pattern1 {
    public static void main(String[]args)
    {
        for(int line=1;line<=4;line++)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
