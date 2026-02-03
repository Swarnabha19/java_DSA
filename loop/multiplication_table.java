import java.util.*;
/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multiplication_table
{
     public static void main(String arg[])
     {
    Scanner obj=new Scanner(System.in);
    System.out.print("enter the number of terms:");
    int n=obj.nextInt();
   
    
    for(int i=1;i<=n;i++)
        {
             System.out.println("the table of "+i+":");
          
        for(int j=1;j<=10;j++)
        {
        System.out.print(i*j+"\t");
        
        
        }
        System.out.println();
        }
    
     
    
    
    
}
}
