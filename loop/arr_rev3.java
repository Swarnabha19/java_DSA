import java.util.*;
public class arr_rev3
{
public static void reverse(int a[],int n)
{
int temp;
for(int i=0;i<n/2;i++)
 {
  temp=a[i];
  a[i]=a[n-1-i];
  a[n-1-i]=temp;
}
System.out.println("the reversed array is: "+Arrays.toString(a));
}

public static void main(String args[])
{
//reverse_arr ob=new reverse_arr();
Scanner obj=new Scanner(System.in);
int n;
 System.out.println("enter number of elements: ");
n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
    {
     System.out.print("a["+(i+1)+"]:");
     a[i]=obj.nextInt();
    }
System.out.println("the given array is:"+Arrays.toString(a));
reverse(a,n);
}
}
