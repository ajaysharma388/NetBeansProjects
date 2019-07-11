/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatearray;

/**
 *
 * @author iamaj
 */


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateArray {
    public static void Rotate(int []a,int round){
        int temp = 0 ;
        for(int i = 0 ; i < round ; i++ ){
            temp = a[0];
            for(int j = 0 ; j < a.length-1 ; j++)
                a[j] = a[j+1];
            a[a.length-1] = temp;
        }
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 0;
	for(int i = 0 ; i < num ; i++){
            int len = sc.nextInt();
            int []Ar = new int[len];
            for(int j = 0 ; j < len ; j++)
                Ar[j] = sc.nextInt();
            r = sc.nextInt();
            Rotate(Ar,r);
        }
    }
}