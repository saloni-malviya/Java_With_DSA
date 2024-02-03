/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Program to print pairs in an array..........................
package apna_college;

public class Pairs_of_Array {
    public static void Pair(int arr[])
    {
        int total_Pair=0;
        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+current+","+arr[j]+")");
               total_Pair++;            
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs is:"+total_Pair);
    }
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,6,7,8};
        Pair(arr);
    }
}
