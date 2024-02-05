/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....................Program to print maximum sum of subarray using prefix........................
package apna_college;
import java.util.*;
public class Maxsubarray_prefix {
    public static void prefix(int n[])
    {
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++)
        {
            int start=i;
            for(int j=i;j<n.length;j++)
            {
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max<currsum)
                {
                    max=currsum;
                }
            }
        }
        System.out.println("Max sum of subarray is:"+max);
    }
    public static void main(String[]args)
    {
        int n[]={2,4,6,8,10};
        prefix(n);
    }
    
}
