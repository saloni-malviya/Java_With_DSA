/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;


public class Type_Promotion {
    public static void main(String[]args)
    {
        char a='a';
        char b='b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        
      //an error occurs because a-b make an integer then integer not convert char
   //    char c=a-b;
   
       //an error occurs because a+b+c make(behave) an integer then integer cannot convert byte
         /* short s=5;
          byte by=25;
          char c='c';
          byte bt=a+b+c;  */
         
         //..........................SECOND RULE.........................
        int i=10;
        long l=25;
        double d=30;
        float f=25.10f;
        double ans=i+l+d+f;
        System.out.println(ans);
    
        //an error occurs because in b*2, b behave an integer then integer cannot convert to byte
        
        /*byte br=5;
        byte ar=b*2;
        System.out.println(ar);*/
        
        //...........then we use this................
        byte br=5;
        byte ar=(byte) (b*2);
        System.out.println(ar);
        
    }
    
}
