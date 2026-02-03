import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number_recur
{
    
    public static int no_series(int number)
    {
        if(number>0)
        {
        return(number+no_series(number-1));
    }
    return 0;
    }
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
      int n,s;
      System.out.println("Enter number of terms:");
      n=obj.nextInt();
      s=no_series(n);
      System.out.println("sum = "+s);
    }
}
    
