import java.util.*;
public class product_of_digits
{
public static void main(String args[])
  {
Scanner obj=new Scanner(System.in);
int n,num,p=1,k;
System.out.println("enter a number: ");
n=obj.nextInt();
num=n;
while(num>0)
{
k=num%10;
p=p*k;
num=num/10;
}
System.out.println("product of digits of "+n+" is: "+p);
  }
}