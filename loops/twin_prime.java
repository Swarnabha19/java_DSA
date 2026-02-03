import java.util.*;
/**
 * Write a description of class prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twin_prime
{
   
        public static void main(String arg[])

        {
        Scanner obj=new Scanner(System.in);
        int m,i,j,n,f=1;
        int count=0;
        System.out.print("enter a: ");
        n=obj.nextInt();
        System.out.print("enter b: ");
        m=obj.nextInt();
        
        if(n==1 || m==1)
        {
        System.out.println(n+" is neither prime nor composite");
        System.exit(1);
    }
    if(m-n==2 || n-m==2)
    {
        for(i=2;i<=n/2;i++)
        {
            if((n%i==0) || (m%i==0))
            {
            f=0;
            break;
        }
            }
            if(f==1)
        System.out.println(n + " and " + m + " are twin prime");
        else
         System.out.println(n + " and " + m + " are not twin prime");
        
        }
        
    }
}


