import java.util.*;
public class selection_sort
{
   
    public static void selection(int a[],int n)
    {
       int temp,j,i;
       for(i=0;i<n;i++)
       {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        }
        System.out.println("the sorted array is : "+Arrays.toString(a));
    }

    
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
        System.out.print("a["+(i+1)+"]:");
        a[i]=obj.nextInt();
        }
        System.out.println("the given array is "+Arrays.toString(a));
        selection(a,n);
    }
}
