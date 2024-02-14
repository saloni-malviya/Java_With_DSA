/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;

public class Switch_Statement {
    public static void main(String[]args)
    {
        int number=2;
        switch(number)
        {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("tea");
                break;
            default:
                System.out.println("nothing");
        }
        
        char ch='a';
        switch(ch)
        {
            case 'a':
                System.out.println("samosa");
                break;
            case 'b':
                System.out.println("burger");
                break;
            case 'c':
                System.out.println("Tea");
                break;
            default:
                System.out.println("nothing");
        }
    }
}
