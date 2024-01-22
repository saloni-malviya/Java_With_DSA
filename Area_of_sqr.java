/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//In a program, input the side of a square. You have to output the area of the square.
//(Hint : area of a square is (side x side))
package apna_college;
import java.util.*;

public class Area_of_sqr {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side");
        int s=sc.nextInt();
        int area=s*s;
        System.out.println("Area of square is:"+area);
        


    }
}
