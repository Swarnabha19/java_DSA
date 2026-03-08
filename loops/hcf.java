import java.util.*;
class hcf {
    public static void main(String[] args) {
        System.out.println("enter 2 numbers:");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=a>b?b:a;
        int hcf=0;
        for(int i=1;i<=c;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.print("hcf  of "+a+" and "+b+" is: "+hcf);
    }
}

