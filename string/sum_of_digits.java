import java.util.*;
class sum_of_digits
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int s=0;
        String n1="";
       
        String st1="tojo1 sarker23@ tuli2";
        st1=st1+" ";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        st1=st1.toLowerCase();
        for(int i=0;i<n;i++)
         {
             
             
             if(st1.charAt(i)>='1' && st1.charAt(i)<='9')
             {
            
              n1=n1+st1.charAt(i);
            }
          else
          {
              if(!n1.equals("")){ //if n1=="" it would not be compiled
                  System.out.println(n1);
               s=s+Integer.parseInt(n1);
                n1="";
            }
          
            }
         }
         
           System.out.println("the sum of digits is : "+s);
          
    }
}

