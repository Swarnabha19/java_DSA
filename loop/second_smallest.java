import java.util.*;
public class second_smallest
{
    public static void second_smallest(int a[],int n)
    {
    int i,j,temp,temp1,k=0;
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
     k=1;
     temp1=a[0];
     while(k<n)
     {
        if(temp1!=a[k])
        {
          System.out.println("the second smallest elemen is : "+a[k]);break;
        }
        k++;
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
    second_smallest(a,n);
    
    }
}