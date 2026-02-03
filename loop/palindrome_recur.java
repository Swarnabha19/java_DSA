import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome_recur
{
    
    public static int palindrome(int n,int sum)
    {
        
        if(n==0)
        {
        return sum;
        }
        
        sum=sum*10+(n%10);
        return palindrome(n/10,sum);
        
    }
       

     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
      int n1,n2;
      System.out.println("Enter the  number:");
      n1=obj.nextInt();
      n2=palindrome(n1,0);
      System.out.println(n2);
       if(n2==n1)
       {
        System.out.println(n1+" is palindrome");
    }
    else{
    
    System.out.println(n1+" is not a palindrome");
    }
      
    }
}
    
