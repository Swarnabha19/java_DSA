import java.util.*;
class largest_word
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        int length=0;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        st1=st1+" ";
        String s2="";
        String lw="";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        for(int i=0;i<n;i++)
        {

           char ch=st1.charAt(i);
            if(ch!=' ')
            {
            s2=s2+ch;
        }
        else
        {
        if(s2.length()>count)
        {
            count=s2.length();
            lw=s2;
            s2="";
        }
        else
        {
            s2="";
        }
        }
        }
        System.out.println("longest word is : "+lw+ " and it's  length is : "+count);
    }
}
