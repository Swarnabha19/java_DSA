import java.util.*;
class cap_first_word
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        st1=" "+st1;
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        st1=st1.toLowerCase();
        String st2="";
        for(int i=0;i<n;i++)
        {
            char ch=st1.charAt(i);
              if(ch==' ')
              {
                  int ch1=st1.charAt(i+1);
                  char ch2=(char)(ch1-32);
                  st2=st2+" "+ch2;
                  i++;
                }
         else
          {
           st2=st2+ch;           
          }
        
         }
         
          System.out.println(st2);
          
    }
}
