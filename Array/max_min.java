import java.util.*;
/**
 * Write a description of class max_min here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class max_min
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n,max;
    System.out.println("enter the number of elements: ");
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the numbers of the array: ");
    for(int i=0;i<n;i++)
    {
    System.out.print("a ["+i+"]: ");
    a[i]=obj.nextInt();
    }
    max=a[0];
    int min=a[0];
    
    for(int i=0;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
        if(min>a[i])
        {
        min=a[i];
        }
    
    }
    System.out.println("the max value is: "+max);
    System.out.println("the min value is: "+min);
    
    
    }
}
