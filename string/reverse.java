import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String st1="arra";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        String st2="";
        for(int i=n-1;i>=0;i--)
        {
         st2=st2+st1.charAt(i);
        }
        System.out.println("the reversed string is "+st2);
        if(st2.equals(st1))
        {
        System.out.println("palindrome");
        }
        else
      {
        System.out.println("not palindrome");    
      }
    }
}