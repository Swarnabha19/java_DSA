import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arr_input
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int i,n;
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
    
}

}
