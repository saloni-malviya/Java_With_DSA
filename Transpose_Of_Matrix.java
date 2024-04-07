/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;
public class Transpose_Of_Matrix {
    public static void transpose(int matrix[][])
    {
        int t[][]=new int[3][3];
        System.out.println("Transpose of matrix is:");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                t[i][j]=matrix[j][i];
               System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
     //   System.out.print(t[j][i]);
    }
    public static void main(String[]args)
    {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.println("enter numbers");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               // System.out.println("matrix is:");
             System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrix);
    }
    
}
