/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..Program to Sort the given array in ascending order using insertion sort..........
package apna_college;

public class Insertion_Sort {
    public static void insertion(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
       // a[j+1]=temp;
    }
    public static void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        int a[]={4,3,6,1,2};
        System.out.println("Array before Sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        insertion(a);
        System.out.println("Array after sorting");
        print(a);
    }
    
}
