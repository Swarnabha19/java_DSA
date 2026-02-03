import java.util.Scanner;

/**
 * Write a description of class list_of_numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class list_of_numbers
{
   public static void main(String arg[])
   {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the number of elements:");
    int n=obj.nextInt();
    for(int i=1;i<=n;i++)
    {
        if(i%2==0)
        System.out.println(i*i);
    
    }
    
}
    }

