package difference;
/**
 *
 * @author ultimatehackers
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution {
  	private int[] elements;
  	public int maximumDifference;
        public Solution(int []A){
        this.elements = A;
    }
    public void computeDifference(){
        int i ;
        int min = 0 ,max = 0;
        min = elements[0];
        for(i = 1 ; i < elements.length ; i++ ){
            if(min>elements[i]){
                min = elements[i];
            }
        }
        max = elements[0];
        for(i = 1 ; i < elements.length ; i++ ){
            if(max<elements[i]){
                max = elements[i];
            }
        }
        
    }
}
public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Solution difference = new Solution(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}