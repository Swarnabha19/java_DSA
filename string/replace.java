import java.util.*;
class replace
{
public static void main(String args[])
{
    Scanner ob=new Scanner(System.in);
    System.out.println("enter string:");
    String st=ob.nextLine();
    int n=st.length();
    System.out.println("enter character to be replaced:");
    char ch=ob.next().charAt(0);
    System.out.println("enter the occurence of the chracter to be replaced:");
    int k=ob.nextInt();
    String st1="";
    int c=0;
    for(int i=0;i<n;i++)
    {
        
     if(st.charAt(i)==ch)
     {
         c++;
         if(c==k)
         {
        st1=st1+'r';
        }
        else
        {
          st1=st1+st.charAt(i);  
        }
      }
        else
        {
        st1=st1+st.charAt(i);
        }
    }
    st=st1;
    System.out.print(st);
   
}
}

