import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maxmin
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int j,i,n,k,max,min;
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
    max=min=a[0]; //3 1 5 2
    for(j=1;j<n;j++)
    {
     if(a[j]>max)
     {
        max=a[j];
        
        }
        else if(a[j]<min)
        {
        min=a[j];
        }
     
    
    }
    
    System.out.println("max : "+max);
    System.out.println("min : "+min);
    
    
}

}
