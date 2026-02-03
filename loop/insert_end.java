import java.util.*;
public class insert_end
{
   public static void addend(int a[],int n)
   {
       int value;
       Scanner ob=new Scanner(System.in);
    System.out.print("enter value to be added at the end: ");
    value=ob.nextInt();
    a[n]=value;
   System.out.println("Array after insertion:");
for(int i=0;i<=n;i++)
{
    System.out.print(a[i]+" ");
}

    
    }
    
    
public static void main(String arg[])
{
Scanner obj=new Scanner(System.in);
int n,value;
System.out.println("enter number of elements (MAX=9): ");
n=obj.nextInt();
int a[]=new int[10];
System.out.println("enter the array elements : ");
for(int i=0;i<n;i++)
{
System.out.print("a["+(i+1)+"]");
a[i]=obj.nextInt();
}
//System.out.println("Array before insertion:"+Arrays.toString(a));
System.out.println("Array before insertion:");

for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
addend(a,n);
}


}