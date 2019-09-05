package absalutedifference;
/**
 *
 * @author ultimatehackers
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AbsaluteDifference {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int d1 = 0,d2 = 0,d3 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                int num = in.nextInt();
                if(num >=-100 && num<=100)
                a[a_i][a_j] = num;
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_i == a_j){
                    d1 = d1 + a[a_i][a_j];
                }
            }
        }
        for(int i=0; i <n; i++){
            int k = i;
            int j;
            j = n - (i+1);
            if( i >= k && j<=n-k){
              d2 = d2 +a[i][j];
            }   
        }
        d3 = d1 - d2;
        if(d3<0){
           d3 = -d3;
        }
       System.out.println(d3);
    }
}
