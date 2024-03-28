/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Given a path containing 4 directions (E,W,N,S),find shortest path to reach destination.
package apna_college;

public class String_ShortestPath {
    public static float shorter_path(String path)
    {
        int x=0;int y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            //South
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='W')
            {
                x--;
            }
            else
            {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    
    public static void main(String[]args)
    {
        String path="WNEENESENNN";
        System.out.println(shorter_path(path));
    }
}
