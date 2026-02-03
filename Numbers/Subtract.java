import java.util.*;
//import java.lang.*;   
public class Subtract {

    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        int diff, n2, n1;
        System.out.print("enter 1st number: ");
        n1 = obj.nextInt();
        System.out.println("enter 2nd number: ");
        n2 = obj.nextInt();
        if(n1>n2){
            diff = n1 - n2;
        }
        else{
            diff = n2 - n1;
        }
        
        System.out.println("Difference is: " + diff);
    }

}