import java.util.*;
class capital
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        System.out.println("the og string is:"+st1);
        st1=" ".concat(st1);
        st1=st1.toUpperCase();
        int n=st1.length();
        String st2="";
        for(int i=0;i<n;i++)
         {
          if(st1.charAt(i)==' ')
          {
           st2=st2+st1.charAt(i+1)+".";
           
          }
        
         }
          System.out.println("number of word in the string is: "+st2);
          
    }
}
