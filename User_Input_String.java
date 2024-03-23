/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;
public class User_Input_String {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println();
        System.out.println("Enter string");
        String s1=sc.nextLine();
        System.out.println(s);
        System.out.println(s1);
        
        //The difference between next() and nextLine()is:-
        
        //next():- this function take one word only that means for ex "Tony is man" than 
        //the output of this line is only "Tony"
        
        //nextLine():- this function cover whole line that means for ex "Tony is man" than 
        //the output of this line is "Tony is man"
    }
}
