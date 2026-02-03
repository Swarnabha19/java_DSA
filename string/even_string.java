import java.util.*;
class even_string
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        System.out.println("enteryour string:");
        String st1=ob.nextLine();
        //String st1="tojo sarker swarnabha rini sir baba tree";
        System.out.println("the og string is:"+st1);
        st1=st1+" ";
        int n=st1.length();
        st1=st1.toLowerCase();
        String st2="";
        for(int i=0;i<n;i++)
         {
             
          if(st1.charAt(i)!=' ')
          {
          st2=st2+st1.charAt(i);
         }
        else
        {
           if(st2.length()%2==0)
          {
            System.out.println(st2);
            count++;
            }
            st2="";
        }
        
         }
          System.out.println("number of even word in the string is: "+count);
          
    }
}

