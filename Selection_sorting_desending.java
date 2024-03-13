/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....Program to sort an array in descending order using selection sort..........
package apna_college;

public class Selection_sorting_desending {
    public static void selection(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[min])
                {
                    min=j;
                }
            }
            int temp= a[min];
            a[min]= a[i];
            a[i]=temp;
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
        int a[]={2,3,1,5,4};
        System.out.println("Array before sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        selection(a);
        System.out.println("Array after Sorting in Descending order");
        print(a);
    }
    
}
