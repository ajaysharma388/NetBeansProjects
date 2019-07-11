/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int getTotalX(int[] a, int[] b) {
        int max = b[0];
        int count,t = 0,l = 0;
        HashMap<Integer, Boolean> hm = new HashMap<>();
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for(int i = 0 ; i < b.length ; i++){
            if(max<b[i]){
                max = b[i];
            }
        }      
        for(int i = 0 ; i <= max ; i++){
            hm.put(i,false);
            count = 0;
            for(int j = 0 ; j < a.length ; j++){
                if(i%a[j]==0){
                    count++;
                }
                if(count == a.length){
                    hm.put(i,true);
                    t++;
                }
            }
        }
        int[] temp = new int[t];
        for (Map.Entry<Integer, Boolean> entry : hm.entrySet()) {
            if(l < temp.length && entry.getValue()== true){
                temp[l] = entry.getKey();
                l++;
            }
        }
        hm.clear();
        t = 0 ;
        for(int j = 0 ; j < temp.length ; j++){
            count = 0;
            for(int i = 0 ; i < b.length ; i++){
                if( temp[j]!=0 && b[i] % temp[j] == 0 && !hmp.containsKey(temp[j])){
                    count++;
                    if(count == b.length){
                        hmp.put(temp[j],1);
                        t++;
                    }
                }
            }
        }
        return t;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int aItr = 0; aItr < n; aItr++) {
             a[aItr] = scan.nextInt();
        }
        for (int bItr = 0; bItr < m; bItr++) {
             b[bItr] = scan.nextInt();
        }
        int total = getTotalX(a, b);   
        System.out.println(total);
    }
}
