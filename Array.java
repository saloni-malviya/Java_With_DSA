/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;

public class Array {
    public static void main(String[]args)
    {
        int marks[]=new int[50];
        //for Input
        Scanner sc=new Scanner(System.in);
        //int phy=sc.nextInt();
         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();
         
         //Output
         System.out.println("Physics marks="+marks[0]);
         System.out.println("Chemistry marks="+marks[1]);
         System.out.println("Maths marks="+marks[2]);
         
         //Update
         marks[2]=99;
         System.out.println("Updated Maths marks="+marks[2]);
         //Or
         marks[2]=marks[2]+1;
         System.out.println("Update Maths marks="+marks[2]);
         
         //calculate percentage
         int per=(marks[0]+marks[1]+marks[2])/3;
         System.out.println("Percentage="+per+"%");
         
         //Length of array
         System.out.println("Length of array="+marks.length);
    }
    
}
