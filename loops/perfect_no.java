import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class perfect_no
{
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
      int sum=0;
    int mult=1;
    System.out.print("enter the number:");
    int n=obj.nextInt();
    for(int i=1;i<n;i++)
        {
     if(n%i==0)
     {
        sum=sum+i;
        
        
        }
    
     
    }
    
    if(sum==n)
    System.out.println(sum+"it is a perfect number");
    else
    System.out.println(sum+"it is not a perfect number");
    
}
}
