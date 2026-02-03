import java.util.*;
public class insert_position
{
   public static void pos(int a[],int n)
   {
       int value,pos;
       Scanner ob=new Scanner(System.in);// 3
       System.out.print("enter the posiion : ");// 1 2    3 4  5  
    pos=ob.nextInt();                           // 0 1  2 3 4  5 
    System.out.print("enter value to be added: ");
    value=ob.nextInt();
    for (int i = n; i > pos-1; i--) {
    a[i] = a[i - 1];
}

a[pos-1]=value;

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
pos(a,n);
}


}