import java.util.*;
public class insertion
{
   public static void addbeg(int a[],int n)
   {
       int value;
       Scanner ob=new Scanner(System.in);
    System.out.print("enter value to be added at the beginning: ");
    value=ob.nextInt();
    for (int i = n; i > 0; i--) {
    a[i] = a[i - 1];
}

a[0]=value;
 System.out.println("Array after insertion:");
for(int i=0;i<=n;i++)
{
    System.out.print(a[i]+" ");
}
System.out.println();
}
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
System.out.println();
} 

 public static void pos(int a[],int n)
   {
       int value,pos;
       Scanner ob=new Scanner(System.in);// 3
       System.out.print("enter the posiion : ");// 1 2    3 4  5  
    pos=ob.nextInt();                          // 0 1  2 3 4  5 
    if(pos>n){
    System.out.println("position exeeds the array length!");
}
    else{
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
System.out.println();
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
while(true){
  System.out.println();  
 System.out.println("1: add at beginning");
 System.out.println("2: add at the end");
 System.out.println("3: add at a given position");
 System.out.println("4: exit");
 System.out.println("Enter option:");
 int opt=obj.nextInt();
 switch(opt)
 {
    case 1:addbeg(a,n);
            break;
    case 2:addend(a,n); break;
    case 3:pos(a,n); break;
    case 4: System.exit(1);
    default: System.out.println("wrong input!");
        
        
    
    }
}


}
}