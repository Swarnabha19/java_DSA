import java.util.*;
/**
 * Write a description of class array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class joinarr
{
    
    public static void delete(int n1,int n2 ,int a1[], int a2[])
    {
    int i,j,k=-1;
    int temp[]=new int[n1+n2];
    for(i=0;i<n1;i++)
    {
     temp[++k]=a1[i];
    }
    for(i=0;i<n2;i++)
    {
     temp[++k]=a2[i];
    }
     for(i=0;i<n1+n2;i++)
    {
     System.out.println(temp[i]);
    }
    }
    
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int j,i,n1,n2,pos,k;
    int a1[]=new int[50];
    int a2[]=new int[50];
    System.out.println("Enter number of elements: ");
    n1=obj.nextInt();
    System.out.println("Enter elements: ");
    for(i=0;i<n1;i++)
    {
    a1[i]=obj.nextInt();
    }
    System.out.println("Array elements ");
    for(i=0;i<n1;i++)
    {
    System.out.println(a1[i]);
    }
    System.out.println("Enter number of elements: ");
    n2=obj.nextInt();
    System.out.println("Enter elements: ");
    for(i=0;i<n2;i++)
    {
    a2[i]=obj.nextInt();
    }
    System.out.println("Array elements ");
    for(i=0;i<n2;i++)
    {
    System.out.println(a2[i]);
    }
    delete(n1,n2,a1,a2);
    
}


}
