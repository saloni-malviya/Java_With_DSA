/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Given an integer array nums, return true if any value appears at least twice in the array
//and return false if every element is distinct.
package apna_college;

public class Twice_array {
    public static boolean twice_array(int arr[], int n)
    {
       
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
               
            }
        }
        return false;
    }

    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,1};
        int n=arr.length;
        System.out.println(twice_array(arr,n));
    }
}
