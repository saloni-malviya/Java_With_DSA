/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;

public class Print_NumberArray {
    public static int printarray(int matrix[][])
    {
        int count=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==7)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        int matrix[][]={{4,7,8},{8,8,7}};
        System.out.println("The count of 7 is:"+printarray(matrix));
    }
    
}
