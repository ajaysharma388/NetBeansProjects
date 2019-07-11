/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerday1;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EulerDay1 {
    public static int Function(int t){
        int sum = 0;
        for(int i = 0 ; i < t ; i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr= new int[t];
        for(int a0 = 0; a0 < t; a0++){
            arr[a0] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            System.out.println(Function(arr[a0]));
        }
    }
}