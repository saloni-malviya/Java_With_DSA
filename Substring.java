/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apna_college;

public class Substring {
    public static String substr(String str,int si,int ei)
    {
        String substring="";
        for(int i=si;i<ei;i++)
        {
            substring=substring+str.charAt(i);
        }
        return substring;
    }
    public static void main(String[]args)
    {
        String str="helloworld";
        System.out.println(substr(str,0,3));
        System.out.println(str.substring(0,6));
    }
    
}
