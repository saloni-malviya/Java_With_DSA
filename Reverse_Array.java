/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.....................Program to print reverse of an array..........................
package apna_college;

public class Reverse_Array {
    public static void reverse(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[]args)
    {
        int arr[]={22,90,655,78,898,900};
        System.out.print("the given array is:");
        for(int i=0;i<arr.length;i++)
        {     
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        reverse(arr);
        System.out.print("the Reverse Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
