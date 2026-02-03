import java.util.*;


//rotation of array using temporary array

public class arr_rotate
{
public static void rotate(int a[],int d,int n)
{
  d=d%n;
  int temp[]=new int[n];
  for(int i=0;i<n-d;i++)
  {
    temp[i]=a[d+i];
    }
    
  for(int i=0;i<d;i++)
  {
    temp[n-d+i]=a[i];
    }

  for(int i=0;i<n;i++)
  {
    a[i]=temp[i];
    }
   System.out.println("the rotated array is:"+Arrays.toString(a)); 

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
    rotate(a,d,n);
}
}