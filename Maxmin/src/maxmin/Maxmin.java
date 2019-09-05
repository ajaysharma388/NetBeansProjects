package maxmin;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Maxmin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long[] sum = new long[5];
        long max = 0,min = 0;
        for(int i=0; i < 5; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++){
            for(int j = 0 ; j < 5 ; j++){
                if (i!=j){
                    sum[i] = sum[i]+arr[j]; 
                }
            }
        }
        max = sum[0];
        min = sum[0];
        for(int i = 0 ; i < 4 ; i++){
            if(max < sum[i+1]){
               max = sum[i+1];                    
            }
            if(min > sum[i+1]){
                min = sum[i+1];
            }
        }
        System.out.println(min+" "+max);
    }
}
