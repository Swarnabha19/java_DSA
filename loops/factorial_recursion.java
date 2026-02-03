import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class factorial_recursion
{
    public static int factorial(int num)
    {
    if(num>1)
    {
     return(num*factorial(num-1));
    }
    return 1;
    
    }
    
    
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the number:");
    int n=obj.nextInt();
    int r=factorial(n);
    System.out.println("factorial of "+n+"is :"+r);
}
}

