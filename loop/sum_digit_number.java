import java.util.*;
public class sum_digit_number
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
         sum=sum+k;
         n1=n1/10;
        }
        System.out.println("sum of digits of "+n+" : "+sum);
        

    }
}
