/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findlargest;

/**
 *
 * @author iamaj
 */

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindLargest {    
    public static void function(int []a){
        int []result = new int[a.length];
        int i = 0;
        for(int k = 0 ; k < result.length-1 ; k++,i++){
            if(a[i]>a[i+1])
                result[k]=a[i+1];
	    else if(a[i]<=a[i+1])
                result[k] = -1;
            else if(k==result.length-1)
		result[k] = -1;
        }
        result[result.length-1] = -1;
        for(int j = 0 ; j < result.length ; j++)
          System.out.print(result[j]+"  ");
	System.out.println();
    }
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
	for(int i = 0 ; i < num ; i++){
            int len = sc.nextInt();
            int []Ar = new int[len];
            for(int j = 0 ; j < len ; j++)
                Ar[j] = sc.nextInt();
            function(Ar);
        }
    }
}