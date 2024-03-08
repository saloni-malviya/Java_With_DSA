/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a
//different day in the future to sell that stock. Return the maximum profit you can achieve 
//from this transaction. If you cannot achieve any profit, return 0.
package apna_college;

public class BuySellStock {
    public static int buySell(int prices[])
    {
        int maxprofit=0;
        int buyprice= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit = prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else
            {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args)
    {
        int prices[]= {7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }
}
