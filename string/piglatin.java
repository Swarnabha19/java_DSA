import java.util.*;
class piglatin
{
public static void main(String args[])
{
    Scanner ob=new Scanner(System.in);
    System.out.println("enter word:");
    String st=ob.nextLine();
    st=st.toLowerCase();
    String st2="",st1="";
    int indx=0;
    int n=st.length()-1;
     for(int i=0;i<n;i++)
     {
         if(st.charAt(i)=='a'|| st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u')
         {
         indx=i;
         break;
        }
    }
     st1=st.substring(0,indx);
     //System.out.println(st1);
     st2=st.substring(indx,n+1);
     //System.out.println(st2);
    st=st2+st1+"ay";System.out.println(st);
}
}

