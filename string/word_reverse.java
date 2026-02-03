class word_reverse
{
    public static String word(String st2)
    {
        String rev="";
        int n=st2.length()-1;
        for(int i=n;i>=0;i--)
        {
        rev=rev+st2.charAt(i);
        }
        return rev;
    }
    public static void main(String args[])
    {
        int count=0;
        //System.out.println("enteryour string:");
        //String st1=ob.nextLine();
        String st1="tojo sarker swarnabha rini sir baba tree";
        System.out.println("the og string is:"+st1);
        st1=st1+" ";
        int n=st1.length();
        st1=st1.toLowerCase();
        String st2="";
        String rev="";
        for(int i=0;i<n;i++)
         {
             if(st1.charAt(i)!=' ')
          {
           st2=st2+st1.charAt(i);
         }
        else
        {
          String s=word(st2);
            //System.out.println(s);
            st2="";
            rev=rev+" "+s;
        }
        
         }
         rev=rev.trim();
          System.out.println("the reversed string is: "+rev);
          
    }
}

