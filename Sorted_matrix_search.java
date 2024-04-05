/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to search key in sorted matrix that means staircase search..................
package apna_college;

public class Sorted_matrix_search {
    public static boolean search(int matrix[][],int key)
    {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("found key at ("+row+","+col+")");
            return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        
    }
    public static void main(String[]args)
    {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=40;
        search(matrix,key);
    }
    
}
