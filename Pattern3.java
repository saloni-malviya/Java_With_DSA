/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Print this pattern.......................
//                    1
//                    12
//                    123
//                    1234

package apna_college;


public class Pattern3 {
    public static void main(String[]args)
    {
        for(int line=1;line<=4;line++)
        {
            for(int number=1;number<=line;number++)
            {
                System.out.print(number);
            }
            System.out.println();
        }
        
    }
    
}
