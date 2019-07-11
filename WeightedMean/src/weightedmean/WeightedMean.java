/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedmean;

/**
 *
 * @author iamaj
 */

import java.io.*;
import java.util.*;

public class WeightedMean {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mean = 0, sum = 0; 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] weight = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            weight[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            mean+=weight[i]*arr[i];
            sum+=weight[i];
        }       
        System.out.printf("%.1f\n",mean/sum);
       }
}