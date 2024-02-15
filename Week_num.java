/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;
import java.util.*;
public class Week_num {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any one week number from 1-7");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;            
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");   
                break;
            case 7:
                System.out.println("Saturday");    
                break;
            default:
                System.out.println("Wrong Input!!");    
        }
    }
}
