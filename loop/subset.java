import java.io.*;
import java.util.*;

class subset {


  static boolean isSubset(int arr1[], int m, int arr2[], int n) {
    if (m > n) return false;
    for (int i = 0; i < m; i++) {
      boolean present = false;
      for (int j = 0; j < n; j++) {
        if (arr2[j] == arr1[i]) {
          present = true;
          break;
        }
      }
      if (present == false) return false;
    }
    return true;
  }

  public static void main(String[] args) {

    int arr1[]={1,3,4,5,2};
	int arr2[]={2,4,3,1,7,5,15};
	System.out.println("aar1: "+Arrays.toString(arr1));
	System.out.println("aar1: "+Arrays.toString(arr2));

    int m = arr1.length;
    int n = arr2.length;

    boolean ans = isSubset(arr1, m, arr2, n);

    if (ans == true)
      System.out.println("arr1[] is a subset of arr2[]");
    else System.out.println("arr2[] is not a subset of arr2[]");
     System.out.println();

  }
}