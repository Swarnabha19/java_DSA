import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reversearr
{
    
    void reverse(int n, int a[])
    {
    int i,j;
    int temp[]=new int[n];
    for(i=0;i<n;i++)
    {
    temp[i]=a[n-1-i];
    }
    for(i=0;i<n;i++)
    {
    a[i]=temp[i];
    }
    
    }
    
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    reversearr rev=new reversearr();
    int j,i,n;
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
    rev.reverse(n,a);
    System.out.println("The reversed array is : ");
    for(i=0;i<n;i++)
    {
    System.out.println(a[i]);
    }
}


}
