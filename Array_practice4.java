/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Given n non-negative integers representing an elevation map where the width of each bar is 1
//compute how much water it can trap after raining.
//height= [0,1,0,2,1,0,1,3,2,1,2,1]


package apna_college;

public class Array_practice4 {
    public static int trapping(int height[])
    {
       //calculate left max boundary
        
        
            int leftmax[]=new int[height.length];
            leftmax[0]=height[0];
            for(int i=1;i<height.length;i++)
            {
                leftmax[i]=Math.max(height[i],leftmax[i-1]);
            }
        
        //calculatr right max boundary
        
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        
        //trapped waterlevel
        int trappedwater=0;
        for(int i=0;i<height.length;i++)
        {
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        //trapped water
         trappedwater+=waterlevel-height[i];
        
    }
        return trappedwater;
    }
    public static void main(String[]args)
    {
        //int arr[]={4,2,0,3,2,5};
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapping(arr));
    }
}
