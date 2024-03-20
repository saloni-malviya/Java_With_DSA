/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Program to find larger number in 2D Array..............................
package apna_college;
import java.util.Scanner;
public class LargestNum_2DArray {
    public static void larger(int matrix[][])
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]>largest)
                {
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("The largest value of this matrix is:"+largest);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println("Enter numbers");
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("The matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               // System.out.println("The matrix is:");
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        larger(matrix);
    }
}
