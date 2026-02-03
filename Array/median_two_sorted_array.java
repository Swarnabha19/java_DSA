import java.util.*;
class median_two_sorted_array {
     public static int[] sort(int[] num)
     {
       int l=num.length;
        int temp;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        return num;
     }
   
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int l=n+m;
        double median;
        int nums3[]= new int[l];  
        for(int i=0;i<n;i++)
        {
            nums3[i]=nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            nums3[n+i]=nums2[i];
        }
        sort(nums3);

        if(l==0) return 0;

        if(l==1) return nums3[l-1];

        int mid=l/2;

        if(mid==0) return 0;
        
        if(l%2==0)
        {
            median=((double)nums3[mid-1]+(double)nums3[mid])/2;
            return median;
        }
        else
        {
            median=nums3[mid];
            return median;
        }

    }
    public static void main(String args[])
    {
        int a1[]={2,5,8,9};
        int a2[]={1,2,4,5};
        System.out.println("a1: "+Arrays.toString(a1));
        System.out.println("a2: "+Arrays.toString(a2));
        System.out.println("the median of the merged sorted array is: "+findMedianSortedArrays(a1,a2));
        
    }
}