import java.util.*;


//rotation of array using temporary array

public class pivot_index
{
public static void pivot(int a[])
{
    int n=a.length;
    int left;
    int right;
    int f=0;
    for(int i=0;i<n;i++)
    {
        left=0;
        right=0;
        for(int j=0;j<i;j++)
        {
        left=left+a[j];
        }
         for(int k=i+1;k<n;k++)
        {
        right=right+a[k];
        }
        if(left==right)
        {
        System.out.println("the pivot index is: "+i);
        System.out.println("the pivot element is: "+a[i]);
        f=1;
        break;
        }
        }
        if(f==0)
        {
        System.out.println("the pivot index is : -1");
        return;
        }
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
    pivot(a);
}
}