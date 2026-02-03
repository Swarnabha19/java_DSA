import java.util.*;
/**
 * Write a description of class max_min here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class linear_search
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n,num,f=0;
    System.out.println("enter the number of elements: ");
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the numbers of the array: ");
    for(int i=0;i<n;i++)
    {
    System.out.print("a ["+i+"]: ");
    a[i]=obj.nextInt();
    }
 
 System.out.println("Enter the element to be searched : ");
 num=obj.nextInt();
 for(int i=0;i<n;i++)
 {
    if(num==a[i])
    {
        System.out.println(num+" found at position "+(i+1));
        f=1;
    }
    }
    if(f==0)
    {
        System.out.println("no element found at any position");
    }

}
}