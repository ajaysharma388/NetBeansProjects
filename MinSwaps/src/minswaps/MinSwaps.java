/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minswaps;

/**
 *
 * @author iamaj
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import javafx.util.Pair;
public class MinSwaps {
static int minimumSwaps(int[] arr) {
        int swaps,count,index,mindex,temp = 0;
        swaps = 0; 
        count = 0;
        while(count < arr.length/2){
            index = count;
            mindex = count;
            for(int i = count ; i < arr.length-count ; i++){
                if(arr[index]<arr[i])
                    index = i;
                if(arr[mindex]>arr[i]){
                    mindex = i;
                    temp = arr[mindex];
                }
            }
            if(arr.length-1-count != index){
                if(arr.length-1-count!=mindex){
                    arr[arr.length-1-count] = arr[arr.length-1-count]+arr[index];
                    arr[index] = arr[arr.length-1-count] - arr[index];
                    arr[arr.length-1-count] = arr[arr.length-1-count]-arr[index];
                }else{
                    arr[arr.length-1-count] = arr[arr.length-1-count]+arr[index];
                    arr[index] = arr[arr.length-1-count] - arr[index];
                    arr[arr.length-1-count] = arr[arr.length-1-count]-arr[index];
                    mindex = index;
                }
                swaps++;
            }
            if(arr[count] != temp && temp > 0){
                arr[count] = arr[count]+arr[mindex];
                arr[mindex] = arr[count] - arr[mindex];
                arr[count] = arr[count]-arr[mindex];
                swaps++;
            }
            count++;
        }
        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        return swaps;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = minimumSwaps(arr);
        System.out.println("\nresult : "+res);
        sc.close();
    }
}
