/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//program to sort an array in descending order using insertion sort
package apna_college;

public class Insertion_Sorting_descending_order {
    public static void insertion(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]<temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[]args)
    {
        int a[]={3,2,4,1,5};
        insertion(a);
        print(a);
    }
    
}
