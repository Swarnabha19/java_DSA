import java.util.*;
public class arr_roatation
{
    public static void arr_roatation(int a[],int d,int n)
    {
        for(int i=0;i<d;i++)
        {
          int first=a[0];
          for(int j=0;j<n-1;j++)
          {
            a[j]=a[j+1]; //1 2 3 4
            }
            a[n-1]=first;
        }
        System.out.println("the rotated array is: "+Arrays.toString(a));
    
    
    }
    
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int n;
    System.out.println("Enter no. of elements:");
    n=obj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    System.out.print("a"+(i+1)+":");
    a[i]=obj.nextInt();
    }
    System.out.println("the given array is: "+Arrays.toString(a));
    System.out.println("enter d: ");
    int d=obj.nextInt();
    arr_roatation(a,d,n);
    
    
    
    
    
    }

}