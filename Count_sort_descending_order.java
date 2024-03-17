/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to sort array in decending order using count sort
package apna_college;

public class Count_sort_descending_order {
    public static void count(int a[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max, a[i]);
        }
        
        int count[]=new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
        
        //sorting
        int j=0;
        for(int i=count.length-1;i>=0;i--)
        {
            if(count[i]>0)
            {
                a[j]=i;
                j++;
                count[i]--;
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
        int a[]={6,4,2,9,7};
        count(a);
        print(a);
    }
    
}
