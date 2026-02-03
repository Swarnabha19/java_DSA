import java.util.*;
class String1
{
public static void main(String args[])
{
    Scanner ob=new Scanner(System.in);
    System.out.print("enter a string:");
    String st=ob.next();
    System.out.print("enter another string:");
    String st1=ob.next();
    System.out.println("the string is "+st);
    System.out.println("the length of string is "+st.length());
    for(int i=0;i<st.length();i++)
    {
        System.out.println("The charecter is st("+i+") : "+st.charAt(i));
    }
    System.out.println("the Upper Case of string is "+st.toUpperCase());
    System.out.println("the Lower Case of string is "+st.toLowerCase());
    System.out.println(st.equals(st1));
    st=st.concat(" ");
    System.out.println("The string is "+st.concat(st1));
    System.out.println("the index is "+st.indexOf("o"));
    System.out.println(st.trim());
    String st3="  swarnabha  ";
    System.out.println(st3);
    st3=st3.trim();
    System.out.println(st3);
    System.out.println("the substring is "+st3.substring(2,4));
    System.out.println(st3.replace("a","i"));
    
}




}



