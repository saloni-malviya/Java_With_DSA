/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// ...............Arithmetic operators(Binary, Unary)........................
//Binary operators......
package apna_college;


public class Operators1 {
    public static void main(String[]args)
    {
        int a=15;
        int b=10;
        System.out.println("Addition is:"+(a+b));
         System.out.println("Subtraction is:"+(a-b));
          System.out.println("Multiplication is:"+(a*b));
           System.out.println("Division is:"+(a/b));
            System.out.println("Modulo is:"+(a%b));
            
            
  //Unary operators(pre increment,Post increment)......
        //Pre increment
        int c=10;
        int d=++c;           //value change then use
        System.out.println(c);
        System.out.println(d);
          
          //Post increment
      int x=10;
      int y=x++;         //value use then change
       System.out.println(x);
        System.out.println(y);
    }
    
}
