import java.util.*;
public class prime_method
{
    public static void prime_method(int a)
    {
      int i,f=1;
      if(a<=1)
      {
          System.out.println(a+" is not a prime nor composite");
          System.exit(1);
      }
      for(i=2;i<=a/2+1;i++)
      {
        if(a%2==0)
        {
        f=0;
        break;
        }
        }
        if(f==1)
        System.out.println(a+" is prime");
        else
        System.out.println(a+" is composite");
    }

    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int x;
        System.out.println("enter number:");
        x=obj.nextInt();
        prime_method(x);
    }
}
