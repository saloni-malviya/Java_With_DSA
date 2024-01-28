/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......................Program to print prime no with the given range.............................
package apna_college;

public class Prime_No_Range_Function {
    public static boolean prime(int n)
    {
      boolean isPrime=true;
      if(n==2)
      {
          return isPrime;
      }
      for(int i=2;i<=n-1;i++)
      {
          if(n%i==0)
          {
              return false;
          }
          
      }
      return isPrime;
    }
    public static void primeRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if (prime(i))
            {
                System.out.print(i+" ");
            }
            
            
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        primeRange(13);
    }
}
