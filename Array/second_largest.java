
import java.util.*;
// public class second_largest
// {
//     public static void bubble(int a[],int n)
//     {
//     int i,j,temp;
//     for(i=0;i<n;i++)
//     {
//         for(j=0;j<n-1-i;j++)
//         {
//             if(a[j]>a[j+1])
//             {
//                 temp=a[j];
//                 a[j]=a[j+1];
//                 a[j+1]=temp;
//             }
//         }
//     }
//      System.out.println("the sorted array is: "+Arrays.toString(a));

//     }
//     public static void main(String args[])
//     {
//     int n,element,max,min;
//     Scanner obj=new Scanner(System.in);
//     System.out.println("enter number of elements: ");
//     n=obj.nextInt();
//     int a[]=new int[n];
//     System.out.println("enter the array elements:");
//     for(int i=0;i<n;i++)
//     {
//     System.out.print("a["+(i+1)+"]:");
//     a[i]=obj.nextInt();
//     }
//     //bubble(a,n);
//     //System.out.println("the second largest element is:"+a[n-2]);
//     max=a[0];min=a[0];
//     int gt2=0,min2=0;
//     for(int j=1;j<n;j++)
//     {
//      if(max<a[j])
//      {
//          gt2=max;
//          max=a[j];
//     }
//      else if(a[j]<max && a[j]>gt2)
//      {
//          gt2=a[j];
//      }
//     }
//         for(int k=1;k<n;k++)
//     {
//      if(a[k]<min)
//      {
//     min2=min;
//      min=a[k];
//     }
//     else if(a[k]>min)
//     {
//     if(min2==0)
//     min2=a[k];
//     else if(a[k]<min2)
//     min2=a[k];
//     }
//     }
//     System.out.println("max: "+max);
//     System.out.println("second largest: "+gt2);
//     System.out.println("min: "+min);
//     System.out.println("SECOND SMALLEST: "+min2);
//     }
// }
public class second_largest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        int first = a[0];
        int second = a[0];
        for (int j = 1; j < n; j++) {
            if (a[j] > first) {
                second = first;
                first = a[j];
            } else if (a[j] > second && a[j] != first) {
                second = a[j];
            }
        }
        System.out.println("the max element is:" + first);
        System.out.println("the second largest element is:" + second);

    }
}
