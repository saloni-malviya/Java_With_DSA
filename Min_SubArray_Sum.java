/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.............................Program to print minimum subarray sum.....................
package apna_college;
import java.util.*;
public class Min_SubArray_Sum {
     public static void MinSubArray(int n[])
    {
     int currsum=0;
        int min=Integer.MAX_VALUE;
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
                if(min>currsum)
                {
                    min=currsum;
                }
               
            }
        }
         System.out.print("the minimum sum of subarray is:"+min);   
    }
      public static void main(String[]args)
    {
        int n[]={2,4,6,8,10};
        MinSubArray(n);
        
    }
}
