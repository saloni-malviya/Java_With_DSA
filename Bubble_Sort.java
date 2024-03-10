/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to Sort the Given Array in Ascending Order using bubble sort.......
package apna_college;

public class Bubble_Sort {
    public static void bubble(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])         // 5>4            5,4,7,1,2
                {
                    int temp=a[j];      //temp=5   
                    a[j]=a[j+1];        //5=4        a[j]=4, a[j+1] =5
                    a[j+1]=temp;        //4=temp
                }
            }
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
        int a[]={5,6,2,1,9};
        System.out.println("Array before sorting");
        for(int i=0;i<a.length;i++)
        {
        System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        bubble(a);
        System.out.println("Array after sorting");
        print(a);
    }
}
