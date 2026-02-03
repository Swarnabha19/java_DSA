import java.util.*;
public class bubble
{
    public static void bubble(int a[],int n)
    {
    int i,j,temp;
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
     System.out.println("Ascending-Descending order is:");
    for(int k=0;k<n/2;k++)
    {
    System.out.println(a[k]+" ");
    }
    for(int k=n-1;k>=n/2;k--)
    {
    System.out.println(a[k]+" ");
    }
    
    }
    
    public static void binary_search(int a[],int n)
    {
        Scanner obj=new Scanner(System.in);
        int element;
        int l = n-1;
        int f=0;
       int m=(f+l)/2;
        System.out.println("enter the element to be searched: ");
        element=obj.nextInt();
        
        while(f<=l)
        {
        if(a[m]==element)
        {
        System.out.println("Element "+element+" has been found on position "+(m+1));
        break;
        }
        else if(a[m]<element)
        {
        f=m+1;
        m=(l+f)/2;
        }
        else if(a[m]>element)
        {
        l=m-1;
        m=(f+l)/2;
        }
        }
        if(f>l)
        {
            System.out.println("element has not been found");
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
    binary_search(a,n);
    }
}