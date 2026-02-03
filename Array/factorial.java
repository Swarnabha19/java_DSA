import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class factorial
{
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the number:");
    int n=obj.nextInt();
    int f=1;
    for(int i=1;i<=n;i++)
    {
        
    f=f*i;
     
    }
    System.out.println("factorial of "+n+"is :"+f);
}
}

