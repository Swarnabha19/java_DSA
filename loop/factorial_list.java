import java.util.*;
/**
 * Write a description of class factorial_list here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class factorial_list
{
    public static void main(String arg[])
    {
     Scanner obj=new Scanner(System.in);
    System.out.print("enter the range of numbers:");
    int n=obj.nextInt();
   
    for(int j=1;j<=n;j++)
    {

    int f=1;
    for(int i=1;i<=j;i++)
    {
        
    f=f*i;
     
    }
    System.out.println("factorial of "+j+" is :"+f);
    
    }
    
    }
    }

