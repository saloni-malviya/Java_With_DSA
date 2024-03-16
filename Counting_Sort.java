/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........Program to sort the given array in ascending order using counting sort
package apna_college;

public class Counting_Sort {
    public static void counting(int a[])
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
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0){
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
        System.out.println();
    }
    public static void main(String[]args)
    {
        int a[]={2,9,7,4,1,8,4};
        counting(a);
        print(a);
    }
}
