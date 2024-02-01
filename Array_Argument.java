/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................................Passing Array as Argument
package apna_college;
import java.util.*;

public class Array_Argument {
    //CALL BY REFERENCE
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    //CALL BY VALUE
    public static void update1(int nonchange)
    {
        nonchange=10;
    }
    public static void main(String[]args)
    {
        //call by reference
        int marks[]={89,99,88};
        update(marks);
        //print our marks
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
        //call by value
         int nonchange=5;
        update1(nonchange);
        System.out.println(nonchange);
    }
}
