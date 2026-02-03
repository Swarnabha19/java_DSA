import java.util.*;
public class duplicate_unsorted
{
public static void duplicate(int a[],int n)
{
    int count=0;
    int a2[]=new int[n];  // 1 2 4 1 2 1
    for(int i=0;i<n;i++)
    {
     a2[i]=0;
    }
    for(int i=0;i<n;i++)
    {
     if(a2[i]==0)
     {
        for(int j=i+1;j<n;j++)
        {
         if(a[i]==a[j])
         {
            a2[j]=1;
            
            }
          }
        }
    }
    System.out.println("the new array after removal of duplicale is:");
    for(int i=0;i<n;i++)
    {
    if(a2[i]==0)
    {
    System.out.print(a[i]+" ");
    }
    }
    for(int k=0;k<n;k++){
        if(a2[k]==1){
            count=count+1;
        }
    }
    System.out.println("the minimum number of elements to be removed are :"+count);
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
    duplicate(a,n);
    }
}