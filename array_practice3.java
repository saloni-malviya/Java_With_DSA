/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........You are given an array prices where prices[i] is the price of a given stock on the ith day.
//........Return the maximum profit you can achieve from this transaction If you cannot achieve any 
//........profit retum 0
package apna_college;

public class array_practice3 {
    public static int Stock(int price[])
    {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++)
        {
            if(buyprice<price[i])
            {
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else
            {
                buyprice=price[i];
            }
        }
            return maxprofit;
            
        
    }
    public static void main(String[]args)
    {
        int price[]={7,6,4,3,1};
        System.out.println(Stock(price));
    }
}
