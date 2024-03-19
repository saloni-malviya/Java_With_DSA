/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Program to search numbers in 2D Array
package apna_college;
import java.util.Scanner;
public class Search_2DArray {
    public static boolean search(int matrix[][], int key)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("number is found at index ["+i+"]["+j+"]");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       int ma[][]=new int[3][3];
        int n=ma.length;
        int m=ma[0].length;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               System.out.println("enter numbers");
               ma[i][j]=sc.nextInt();
           }
       }
       //output
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               System.out.print(ma[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("Enter number which you want to search");
       int key=sc.nextInt();
       search(ma,key);
    }
    
}
