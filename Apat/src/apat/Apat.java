/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apat;

/**
 *
 * @author iamaj
 */
import java.util.*;
public class Apat {
    public static int[] fun(int []arr){
        int temp = 1;
        int result[] = new int[arr.length];
        result[0] = arr[0] - temp;
        for(int i = 1 ; i < arr.length ; i++){
                int a = arr[i-1] - arr[i];
                if(a<0)
                    a = (-1)*a;
                result[i] = result[i-1]+a;
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        int []arr = new int[numTest];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = sc.nextInt();
        int []result = fun(arr);
        for(int i = 0 ; i < result.length ; i++)
            System.out.print(result[i]+" ");
        System.out.println();
    }
}