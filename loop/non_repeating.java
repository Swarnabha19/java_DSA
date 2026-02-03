import java.util.*;
public class non_repeating
{
	static void findNonRepeatingElement(int a[]) {
	    boolean chk;
	    for(int i=0;i<a.length;i++) {
	        chk = false;
	        for(int j=0;j<a.length;j++) {
	            if(i != j && a[i] == a[j]) {
	                chk = true;
	                break;
	            }
	        }
	        if(chk==false) System.out.print(a[i]+" ");
	    }
	}
	 static void findRepeating(int a[]) {
	    boolean chk;
	    for(int i=0;i<a.length;i++) {
	        chk = false;
	        for(int j=0;j<a.length;j++) {
	            if(i != j && a[i] == a[j]) {
	                chk = true;
	                break;
	            }
	        }
	        if(chk==true) System.out.print(a[i]+" ");
	    }
	}
	public static void main(String[] args) {

	    Scanner obj=new Scanner(System.in);
          int n;
          System.out.println("enter the number of elements: ");
          n=obj.nextInt();
          int a[]=new int[n];
          System.out.println("Enter the numbers of the array: ");
         for(int i=0;i<n;i++)
          {
            System.out.print("a ["+i+"]: ");
            a[i]=obj.nextInt();
        }
           System.out.println("the array is :"+Arrays.toString(a));
           System.out.println("the non repeating numbers of the array are : ");
	   findNonRepeatingElement(a);
	   System.out.println("the  repeating numbers of the array are : ");
	   findRepeating(a);

	}
}