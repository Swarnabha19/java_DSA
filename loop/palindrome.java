import java.util.*;
public class palindrome
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int i,n,n1,k=1,sum=0;
        System.out.print("enter a number :");
        n=obj.nextInt();
        n1=n;
        while(n1>0)
        {
         k=n1%10;
         sum=sum*10+k;
         n1=n1/10;
        }
        if(sum==n)
        System.out.println(sum+":"+n +" is a palindrome");
        else
        System.out.println(sum+":"+n +" is not a palindrome");
        

    }
}
