import java.util.*;
class intersectio_arr {
    public static void intersection(int[] nums1, int[] nums2) {
        int k,count=0;
      int  n=nums1.length;
      int m=nums2.length;
      int l=n+m;
        int temp[]=new int[n+m];
        int check[]=new int[n];
      for(int i=0;i<n;i++)
      {
        check[i]=0;
      }
      System.out.println("the common elements are: ");
      for(int i=0;i<n;i++)
      {
        if(check[i]==0){

        for(int j=0;j<m;j++)
        {
            if(nums1[i]==nums2[j])
            {
                count++;
                check[i]=1;
                System.out.print(nums1[i]+" ");
                break;
            }
        }

       }
      }
     

    }
     public static void main(String args[])
     {
         Scanner obj=new Scanner(System.in);
         int n,m;
         System.out.println("enter number of elements in a1: ");
         n=obj.nextInt();
         int a1[]=new int[n];
         System.out.println("enter array elements:");
         for(int i=0;i<n;i++)
         {
            System.out.print("a1["+i+"]: ");
            a1[i]=obj.nextInt();
            }
        System.out.println("enter number of elements in a2: ");
         m=obj.nextInt();
         int a2[]=new int[m];
         System.out.println("enter array elements:");
         for(int i=0;i<m;i++)
         {
            System.out.print("a2["+i+"]: ");
            a2[i]=obj.nextInt();
            }
        intersection(a1,a2);

     }
}