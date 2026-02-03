import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci_recursion
{
    
    public static void fibo(int a, int b,int t)
    {
          int c;
          if(t>2)
          {
              c=a+b;
              System.out.print(c+" ");
              a=b;
              b=c;
              fibo(a,b,t-1);
          }
    }
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
      int a=0;
      int b=1;
      System.out.print("enter the number of terms:");
      int n=obj.nextInt();
      System.out.print(a+" "+b+" ");
      fibo(a,b,n);
    }
    
}
