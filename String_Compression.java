/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......Program for String Compression using String Builder...............
package apna_college;


public class String_Compression {
    public static String compress(String str)
    {
        StringBuilder sb=new StringBuilder("");
        //String newstr="";      //string method
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
          //  newstr=newstr+str.charAt(i);        //string method
            if(count>1)
            {
                sb.append(count);
                //newstr=newstr+count.toString();
            }
        }
        return sb.toString();
        //return newstr;
    }
    public static void main(String[]args)
    {
        String str="aaabbbccccddd";
        System.out.println(compress(str));
    }
    
}
