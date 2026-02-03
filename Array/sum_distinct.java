import java.util.*;
public class sum_distinct
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int sum=0,num,n,f;
    int a[]={1,2,3,2,5,1,7,5};
    for(int i=0;i<a.length;i++)
    {
        f=0;
        for(int j=0;j<i;j++)
        {
            if(a[i]==a[j])
            {
            f=1;
            break;
            }
        }
       if(f==0){
        sum=sum+a[i];
        }
       }
    
     System.out.println("sum is: "+sum);
    
    
    }
}