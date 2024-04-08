/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........Program to print out the sum of the numbers in the second row of the array.......
package apna_college;

public class Sum_of_Matrix {
    public static int sumMatrix(int matrix[][])
    {
        int sum=0;
       int i=1;
        
            for(int j=0;j<matrix[0].length;j++)
            {
                sum+=matrix[i][j];
            }
            return sum;
        
    }
    public static void main(String[]args)
    {
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Sum is:"+sumMatrix(matrix));
    }
    
}
