// we have to find the repeating elements in an array
// elements are integers and are from 1 to length
//find the missing value which are not in the range
// there is only one missing and one repeating number
import java.util.Arrays;
public class missing
{
static void find_repeating_missing(int a[])
{
int j,i,count,repeat=-1,missing=-1;
int n=a.length;
for(i=1;i<=n;i++)
{
count=0;
for(j=0;j<n;j++)
{
if(a[j]==i)
{
count++;
}
    if (count == 0) {
                missing = i;
            } else if (count > 1) {
                repeat = i;
            }
}
}
System.out.println("Repeating number is: " + repeat);
        System.out.println("Missing number is: " + missing);
}

public static void main(String args[])
{

int a[]={1,2,3,1};
System.out.println("the array is: "+Arrays.toString(a));
find_repeating_missing(a);

}

}