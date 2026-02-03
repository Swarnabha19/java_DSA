import java.util.*;

public class arr_input
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int roll[]=new int[4];
        String name[]=new String[4];
        float score[]=new float[4];
        char grade[]= new char[4];
        System.out.println("enter roll,name,score,grade: ");
        for(int i=0;i<2;i++)
        {
        roll[i]=obj.nextInt();
        name[i]=obj.next();
        score[i]=obj.nextFloat();
        grade[i]=obj.next().charAt(0);
        }
        for(int i=0;i<2;i++)
        {
        System.out.println("Details of Student "+(i+1)+" is:");    
        System.out.println("roll : "+roll[i]);
        System.out.println("name : "+name[i]);
        System.out.println("score : "+score[i]);
        System.out.println("grade: "+grade[i]);
        }
    
    
    }
}
