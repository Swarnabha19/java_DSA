import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count,k=0;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        
        int f[]=new int[n];
        char cr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            count=0;
            char ch=st1.charAt(i);
            if(ch!='0')
            {
                cr[k]=ch;
                String st2="";
             for(int j=0;j<n;j++)
             {
                if(st1.charAt(j)==ch)
            {
             count=count+1;
             st2=st2+'0';
            }
            else
            st2=st2+st1.charAt(j);
            }
            f[k]=count;
            k++;
            st1=st2;
            System.out.println(st1);
        }
    }
    for(int p=0;p<k;p++)
        {
            if(cr[p]!=' ')
            System.out.println(cr[p]+" : "+f[p]);
        }
    }
}