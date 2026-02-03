import java.util.*;
public class krisnamurty
{
    

    
    public static void main(String arg[])
    {
     Scanner obj=new Scanner(System.in);
     int i,n,n1,j,k=1,f,sum=0;
     
     System.out.print("enter number: ");
     n=obj.nextInt();
     n1=n;
     while(n>0)
     {
         f=1;
     k=n%10;
     for(i=1;i<=k;i++)
     {
        f=f*i;
        }
        sum=sum+f;
        n=n/10;
    }
    if(sum==n1)
    System.out.println(n1+" is krisnamurtyi number");
    else
    System.out.println(n1+" is not a krisnamurtyi number");
}
}
