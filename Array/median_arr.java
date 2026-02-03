import java.util.*;
public class median_arr
{
public static void bubble(int a[],int n)
    {
    int i,j,temp;
    float sum=0,median;
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
     
     for(int k=0;k<n;k++)
     {
        sum=sum+a[k];
        
        }
        float avg=sum/n;
        System.out.println("sum of elements is : "+sum);
        System.out.println("average of elements is :"+avg);
      if(n%2==0)
      {
        median=(a[n/2]+a[n/2-1])/2;
         System.out.println("median is : "+median);
        }
     else
     {
         median=a[n/2];
        System.out.println("median is : "+median);
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