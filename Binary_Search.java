/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.............................Binary Search Program............................
package apna_college;

public class Binary_Search {
    public static int binarySearch(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //Comparison
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)      //right side(2nd half)
            {
                start=mid+1;
            }
            else                //left side(1st half)
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int arr[]={22,44,55,57,89,90,105};
        int key=89;
        int index=binarySearch(arr,key);
        if(index==-1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println("element found at index:"+index);
        }
    }
    
}
