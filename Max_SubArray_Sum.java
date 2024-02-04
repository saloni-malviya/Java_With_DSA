/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........................Program to print maximum subarray sum..........................
package apna_college;
import java.util.*;
public class Max_SubArray_Sum {
    public static void max_subarray(int n[])
    {
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            int start=i;
            for(int j=i;j<n.length;j++)
            {
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++)
                {
                    currsum=currsum+n[k];
                }
                System.out.println("the current sum is:"+currsum);
                if(max<currsum)
                {
                    max=currsum;
                }
               
            }
        }
         System.out.print("the maximum sum of subarray is:"+max);
    }
    
    public static void main(String[]args)
    {
        int n[]={2,4,6,8,10};
        max_subarray(n);
        
    }
    
}
