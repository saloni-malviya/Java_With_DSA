/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..................Program to find the smallest number in a given array
package apna_college;
import java.util.*;
public class Smallest_array {
    public static int smallNum(int arr[])
    {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[]args)
    {
        int arr[]={23,54,21891,90,21,43,89,11,20};
        System.out.println("The smallest number is:"+smallNum(arr));
    }
    
}
