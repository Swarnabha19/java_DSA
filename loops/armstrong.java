import java.util.*;
import java.lang.*;
public class armstrong
{
   public static void main(String arg[])
   {
    Scanner obj=new Scanner(System.in);
    int n2,n1,i,n;
    double r,count=0,sum=0;
    System.out.print("enter number: ");
    n=obj.nextInt();
    n1=n;n2=n;
    while(n1>0)
    {
    n1=n1/10;
    count=count+1;
    }
    while(n2>0)
    {
        r=n2%10;
        sum=sum+Math.pow(r,count);
        n2=n2/10;
    }
    if(sum==n)
    System.out.println(sum+" is an armstrong number");
    else
    System.out.println(sum+ " not an armstrong number");
    }
}
