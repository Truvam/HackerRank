import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*

Sample Input
7
0 1 2 4 6 5 3

Sample Output
3

*/

public class FindTheMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] val = new int[n];
        for(int i = 0; i < n; i++) {
          val[i] = stdin.nextInt();
        }
        Arrays.sort(val);
        int position = val.length/2;
        System.out.println(val[position]);
    }
}