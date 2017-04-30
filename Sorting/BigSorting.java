import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Sample Input 0
6
31415926535897932384626433832795
1
3
10
3
5

Sample Output
1
3
3
5
10
31415926535897932384626433832795

*/

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        BigInteger[] nums = new BigInteger[unsorted.length];
        for(int i = 0; i < unsorted.length; i++) {
          nums[i] = new BigInteger(unsorted[i]);
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
          System.out.println(nums[i]);
        }
    }
}