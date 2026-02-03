import java.util.*;
class vowel
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0,space=0,con=0,sp=0;
        //String st1="tojo";
        String st1="tojo1 sarker@ tuli2";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        st1=st1.toLowerCase();
        for(int i=0;i<n;i++)
         {
             if(st1.charAt(i)>='a' && st1.charAt(i)<='z')
             {
          if(st1.charAt(i)=='a' || st1.charAt(i)=='e' || st1.charAt(i)=='i' || st1.charAt(i)=='o' || st1.charAt(i)=='u')
          {
           count++;
           
          }
          else
          {
                con++;
          }
        }
          else if(st1.charAt(i)==' ')
          {
             space++;
            }
         else
         {
            sp++;
            }
         }
          System.out.println("number of vowel is: "+count);
         
          System.out.println("number of consonent is: "+con);
          System.out.println("the blank space is : "+space);
           System.out.println("the number of special characters is : "+sp);
          
    }
}
