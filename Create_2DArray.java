/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Program to create 2D Array..................
package apna_college;
import java.util.Scanner;
public class Create_2DArray {
    public static void main(String[]args)
    {
        int matrix[][]=new int[3][3];
    //    int n=3;
      //  int m=3;
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                System.out.println("enter numbers");
                matrix[i][j]=sc.nextInt();
            }
        }
        
        //output
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
