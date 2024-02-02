/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......................Program to find the largest number in a given array
package apna_college;
import java.util.*;
public class Largest_Array {
    public static int largerArray(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        if(largest<arr[i])
        {
            largest=arr[i];
        }
        }
        return largest;
    }
    public static void main(String[]args)
    {
        int arr[]={23,432,32,2123,534,908};
        System.out.println("The Largest element is:"+largerArray(arr));
    }
}
