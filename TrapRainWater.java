/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.................Trapped Rain Water...................................
package apna_college;
import java.util.*;

public class TrapRainWater {
    public static int trapwater(int height[])
    {
        int n=height.length;
        //calculate left max boundary- array
        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        
        //calculate right max boundary array
        int maxright[]= new int[n];
        maxright[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxright[i]=Math.max(height[i], maxright[i+1]);
        }
        
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(leftMax[i], maxright[i]);
            trappedwater += waterlevel-height[i];
        } return trappedwater;
    }
    public static void main(String[]args)
    {
        int height[]={4,2,0,6,3,2,5};
        
        System.out.println(trapwater(height));
    }
}
