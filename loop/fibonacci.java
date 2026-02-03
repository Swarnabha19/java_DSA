import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci
{
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
      int a=0;
      int b=1;
      int c;
    System.out.print("enter the number of terms:");
    int n=obj.nextInt();
    System.out.println("the fibonacci series is: ");
      System.out.println(a);
    
      System.out.println(b);
    
    for(int i=0;i<(n-2);i++)
        {

     
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
        
        
        }
    
     
    
    
    
}
}
