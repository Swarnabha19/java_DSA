import java.util.*;
public class duplicate_remove
{
public static void bubble(int a[],int n)
    {
    int i,j,temp,count=0;
    int a2[]=new int[n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    System.out.println("the sorted array is: "+Arrays.toString(a));
    for(int k=1;k<n;k++)
    {
    if(a[count]!=a[k])
    {
    count++;
    a[count]=a[k];
    
    }
    
}
      // System.out.println("new array is: "+Arrays.toString(a2));
       for(int p=0;p<=count;p++) //temp1 is the index and temp1+1 is the length
       {
        System.out.print(a[p]+" ");
        }
    }
    
 public static void main(String args[])
    {
    int n,element;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of elements: ");
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
    {
    System.out.print("a["+(i+1)+"]:");
    a[i]=obj.nextInt();
    
    }
    bubble(a,n);
    }
}