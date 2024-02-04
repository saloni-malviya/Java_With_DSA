/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//................Program to print max subarray sum using kadan's algorithm
package apna_college;
import java.util.*;
public class MaxSubarray_KadanAlgo {
    public static void kadan(int n[])
    {
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            currsum=currsum+n[i];
            if(currsum<0)
            {
                currsum=0;
            }
            max=Math.max(currsum, max);
        }
        System.out.print("max sum is:"+max);
    }
    public static void main(String[]args)
    {
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        kadan(n);
    }
    
}
