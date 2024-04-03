/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.........Program to print diagonal sum of matrix..................
package apna_college;

public class Diagonal_Sum {
    public static int d_sum(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //primary diagonal
                if(i==j)
                {
                  sum=sum+matrix[i][j];  
                }
                //secondary diagonal
                else if(i+j==matrix.length-1)
                {
                    sum=sum+matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[]args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("The diagonal sum is:");
       System.out.println(d_sum(matrix));
    }
    
}
