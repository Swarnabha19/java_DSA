import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        //String st1="tojo";
        String st1="aabaa";
        System.out.println("the og string is:"+st1);
        int n=st1.length()-1;
        String st2="";
        for(int i=0;i<=n;i++)
         {
          if(st1.charAt(i)!=st1.charAt(n-i))
          {
           count=1;
           break;
          }
        
         }
        if(count==0)
         {
          System.out.println(st1+"is palindrome");

         }
        else
         {
          System.out.println(st1+" is not a palindrome");
        }
    }
}
