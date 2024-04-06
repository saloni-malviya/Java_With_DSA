/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to search key in sorted matrix to point bottom up element that means staircase search ...
package apna_college;

public class SortMatrix_search {
    public static boolean search(int matrix[][],int key)
    {
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[]args)
    {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        search(matrix,key);
    }
    
}
