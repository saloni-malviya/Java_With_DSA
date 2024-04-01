/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Java program for a given set of string, print the largest string....................
package apna_college;

public class Largest_String {
    public static void main(String[]args)
    {
        String fruits[]={"apple","bnana","mango","watermalon"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
