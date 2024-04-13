/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..........Create String Builder and use of string builder and find length.........
package apna_college;

public class String_Builder {
    public static void main(String[]args)
    {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
