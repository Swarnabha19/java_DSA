import java.util.*;
public class nqt_chocolate
{
 public static void main(String args[])
     {
        Scanner obj=new Scanner(System.in);
        int a[]={4,5,0,1,9,0,5,0};
        int x[] = new int[a.length];  // to hold zeros
        int y[] = new int[a.length];  // to hold non-zeros
        int i,j,num,temp=0,p=0;
        System.out.println("the given array is: "+Arrays.toString(a));
        for(i=0;i<a.length;i++)
        {
         if(a[i]==0)
         {
              x[p++]=a[i];
            
          }
          else{
            y[temp++]=a[i];
            }
        
        }
        
        //System.out.println("the new array is:  "+Arrays.toString(x));
        System.out.println("the new array is : "+Arrays.toString(y));
        
        
        
        }


}