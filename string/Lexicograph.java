import java.util.*;
class Lexicograph
{
public static void main(String args[]){
String st="TAojO123";
String st1="";
System.out.println((int)st.charAt(1));
for(int i=48;i<=122;i++)
{
 for(int j=0;j<st.length();j++)
 {
     char ch=st.charAt(j);
     if(i==(int)ch)
     {
         st1=st1+ch;
     }
 }
}
System.out.println(st1);
}
}