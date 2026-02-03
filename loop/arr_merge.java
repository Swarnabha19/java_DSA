import java.util.*;
/**
 * Write a description of class max_min here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arr_merge
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n1,n2,k=-1;
    System.out.println("enter the number of elements of a1: ");
    n1=obj.nextInt();
    int a1[]=new int[n1];
    System.out.println("enter the number of elements of a2: ");
    n2=obj.nextInt();
    int a2[]=new int[n2];
    System.out.println("Enter the numbers of first array: ");
    for(int i=0;i<n1;i++)
    {
    System.out.print("a1 ["+i+"]: ");
    a1[i]=obj.nextInt();
    }
    System.out.println("enter elements of second array");
    for(int i=0;i<n2;i++)
    {
    System.out.print("a2 ["+i+"]: ");
    a2[i]=obj.nextInt();
    }
    System.out.println("the merged array is: ");
    int a3[]=new int[n1+n2];
     for(int i=0;i<n1;i++)
     {
         a3[++k]=a1[i];
        
    }
    for(int i=0;i<n2;i++)
     {
         a3[++k]=a2[i];
    }
    for(int i=0;i<=k;i++)
     {
         System.out.println(a3[i]);
        
    }
}
}