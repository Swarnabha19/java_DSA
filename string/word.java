import java.util.*;
class word
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=1;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        st1=st1.toLowerCase();
        for(int i=0;i<n;i++)
         {
          if(st1.charAt(i)==' ')
          {
           count++;
           
          }
        
         }
          System.out.println("number of word in the string is: "+count);
          
    }
}
