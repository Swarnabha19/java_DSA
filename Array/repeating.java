import java.util.*;
public class repeating
{
    public static void findRepeatingElements(int arr[]) {
        int cnt = 0;
        int[] dup = new int[arr.length];
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                dup[cnt++] = arr[i];
               }
            }
        }
        for(int i=0;i<cnt;i++) 
        {
        System.out.println(dup[i]);
        }
        Arrays.sort(dup,0,cnt);
        System.out.print("The repeating elements are: ");
        for(int i=0;i<cnt;i++) 
            if(dup[i] != dup[i+1]) System.out.print(dup[i]+" ");
    }
    public static void main(String[] args) {
    int n;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter number of elements: ");
    n=obj.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements:");
    for(int i=0;i<n;i++)
    {
    System.out.print("a["+(i+1)+"]:");
    a[i]=obj.nextInt();
    
    }
       
        
        System.out.println("the array is : "+Arrays.toString(a));
        findRepeatingElements(a);
    }
}