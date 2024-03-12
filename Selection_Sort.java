/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to Sort the given array in ascending order using selection sort
package apna_college;


public class Selection_Sort {
    public static void selection(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)    //5,4,6,2,3
            {                                //min=5, j=4, i=5
                if(a[j]<a[min])              // 4<5
                {
                    min=j;                    //5=4,  min=4
                }
                                            //temp=4, 4=5, 5=temp,   a[i]=4,a[min]=5
               }
            int temp=a[min];             
                a[min]=a[i];
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
        int a[]={2,5,3,1,4};
        System.out.println("Array before Sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        selection(a);
        System.out.println("Array after Sorting");
        print(a);
    }
    
}
