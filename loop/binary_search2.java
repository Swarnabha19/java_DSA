import java.util.*;

public class binary_search2
{

   
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int m,f,l,num,element;
        System.out.println("Enter number of elements: ");
        num=obj.nextInt();
        int a[]=new int[num];
        System.out.println("Enter elements: ");
        for(int i=0;i<num;i++)
            {
             System.out.print("a["+(i+1)+"]: ");
             a[i]=obj.nextInt();
            }
            
        f=0;
        l=num-1;
        m=(l+f)/2;
         System.out.println("Enter the element to be searched: ");
         element=obj.nextInt();
        while(f<=l)
        {
         if(a[m]==element)
         {
             System.out.println("element "+element+" has been found at position "+(m+1));
             break;
            }
            else if(a[m]<element)
            {
            f=m+1;
            m=(l+f)/2;
        }
        else if(a[m]>element)
        {
        l=m-1;
        m=(l+f)/2;
        }
        
        }
        if(f>l)
        {
         System.out.println("element has not been found in the array");
        }
        }
    }

