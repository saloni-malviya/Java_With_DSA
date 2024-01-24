/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............Print this pattern....................
//                    1
//                    23
//                    456
//                    78910
package apna_college;

public class Pattern5 {
    public static void main(String[]args)
    {
        int num=1;
        for(int line=1;line<=4;line++)
        {
            for(int number=1;number<=line;number++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    
}
