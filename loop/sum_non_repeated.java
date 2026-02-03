
import java.util.*;
public class sum_non_repeated
{
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
    int sum=0,num,n,f;
    int a[]={1,2,3,2,5,1,7,5};
    for(int i=0;i<a.length;i++)
    {
        f=0;
        for(int j=0;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
            f++;
            }
        }
       if(f<2){
        sum=sum+a[i];
        System.out.println("element appearing only once is: "+a[i]);
        }
       }
    
     System.out.println("sum of element appearing only once is: "+sum);
    
    
    }
}