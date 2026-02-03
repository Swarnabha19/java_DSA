import java.util.*;
class frequency_ascii
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int count,k=0;
        //String st1="tojo";
        String st1="tojo sarker swarnabha";
        System.out.println("the og string is:"+st1);
        int n=st1.length();
        st1=st1.toUpperCase();
        int f[]=new int[n];
        char cr[]=new char[n];
        for(int i=65;i<=90;i++)
        {
            count=0;
             for(int j=0;j<n;j++)
             {
                if(st1.charAt(j)==(char)i)
            {
             count=count+1;
            }
          }
            if(count>0)
            {
            f[k]=count;
            cr[k]=(char)i;
            k++;
        }
    }
        for(int p=0;p<k;p++)
        {
            if(cr[p]!=' ')
            System.out.println(cr[p]+" : "+f[p]);
        }
    }
    

}