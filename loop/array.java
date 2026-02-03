import java.util.*;

public class array
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int []a={1,2,3};
        String name[]={"Tojo","Kamalika","Shibangi"};
        char ch[]={'a','b','c'};
       System.out.print("enter name: ");
        String n=obj.next();
        for(int i=0;i<a.length;i++)
        {
            if(name[i].equals(n)==true) //only for string; for number if(a[i]==n){}
            System.out.println(a[i]+" is "+name[i]);
            //System.out.println(ch[i]);

        }
    
    
    }

} 