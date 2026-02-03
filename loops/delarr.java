import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class delarr
{
    
    public static void delete(int n, int a[], int pos)
    {
    int i,j;
    //int temp[]=new int[n+1];
    for(i=pos;i<n;i++)
    {
    a[i-1]=a[i];
    }
    System.out.println("The new array is : ");
    for(i=0;i<n-1;i++)
    {
    System.out.println(a[i]);
    }
    
    }
    
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int j,i,n,pos,k;
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
    }
    System.out.println("enter position: ");
    pos=obj.nextInt();
    delete(n,a,pos);
    
}


}
