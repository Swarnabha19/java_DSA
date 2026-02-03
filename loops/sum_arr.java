import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum_arr
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int i,n,sum=0;
    int a[]=new int[50];
    System.out.println("Enter number of elements: ");
    n=obj.nextInt();
    System.out.println("Enter elements: ");
    for(i=0;i<n;i++)
    {
    a[i]=obj.nextInt();
    }
    System.out.println("Array elements ");
    for(i=0;i<n;i++)
    {
    System.out.println(a[i]);
    sum=sum+a[i];
    }
      System.out.println("the sum of elements is: "+sum);
    
    
}

}
