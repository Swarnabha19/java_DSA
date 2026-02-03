import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arr_even_odd
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int j,i,n,count1=0,count2=0,even,odd;
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
    System.out.println("The even elements are : ");
    for(i=0;i<n;i++)
    {
    if(a[i]%2==0)
    {
    System.out.println(a[i]);
    count1=count1+1;
    }
    }
    System.out.println("The odd elements are : ");
    for(i=0;i<n;i++)
    {
    if(a[i]%2!=0)
    {
    System.out.println(a[i]);
    count2=count2+1;
    }
    }
    System.out.println("Number of even elements is : "+count1);
    System.out.println("Number of odd elements is : "+count2);
}

}
