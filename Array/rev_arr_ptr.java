import java.util.*;
public class rev_arr_ptr
{
public static void reverse(int arr[],int n)
{
int temp;
int p1=0;
int p2=n-1;
while(p1<p2)
{
temp = arr[p1];
arr[p1] = arr[p2];
arr[p2] = temp;
p1++;
p2--;
      }
System.out.println("the reversed array is: "+Arrays.toString(arr));
}



public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n;
 System.out.println("enter number of elements: ");
n=obj.nextInt();
int arr[]=new int[n];
System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
    {
     System.out.print("a["+(i+1)+"]:");
     arr[i]=obj.nextInt();
    }
System.out.println("the given array is:"+Arrays.toString(arr));
reverse(arr,n);
}
}
