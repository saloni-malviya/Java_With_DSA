/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............................Linear Search Program..................................
package apna_college;

public class Array_Linear_Search {
    public static int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args)
    {
     int arr[]={22,12,287,21,90,767};
     int key = 90;
     int index=linearSearch(arr,key);
     if(index==-1)
     {
         System.out.println("Not Found");
     }
     else{
     System.out.println("element found at index:"+index);
     }
}
}