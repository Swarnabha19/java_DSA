import java.util.*;
/**
 * Write a description of class prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class prime
{
   
        public static void main(String arg[])

        {
        Scanner obj=new Scanner(System.in);
        int i,j,n,f=1;
        int count=0;
        System.out.print("enter number: ");
        n=obj.nextInt();
        if(n==1)
        {
        System.out.println(n+" is neither prime nor composite");
    }
    else
    {
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
            f=0;
            break;
        }
            }
            if(f==1)
            System.out.println(n+" is prime");
            else
            System.out.println(n+" is composite");
        }
        
        
        
        }
    }


