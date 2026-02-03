import java.util.*;
public class insertion_sort
{
    
    public static void insertion(int a[],int n)
    {
        int temp,i,j;
        for(i=1;i<n;i++)
        {
            j=i;
            while(j>0 && a[j-1]>a[j])
            {
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        System.out.println("the sorted array is: "+Arrays.toString(a));
    }
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n;
      System.out.print("Enter the number of elements:");
      n=obj.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements:");
      for(int i=0;i<n;i++)
      {
        System.out.print("a["+(i+1)+"]:");
        a[i]=obj.nextInt();
        }
    System.out.println("the given array is: "+Arrays.toString(a));
    insertion(a,n);
    }
}
