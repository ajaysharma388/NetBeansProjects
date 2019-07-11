/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartiles;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class Quartiles {

    /**
     * @param args the command line arguments
     */
    public static void sortArray(int []arr){
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q1,Q2,Q3,temp = 0;
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i = 0 ; i < n1 ; i++ ){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        for(int i = 0 ; i < n1 ; i++ ){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        if( n1%2==0 ){
            n1 = n1-1;
            if((n1/2-1)%2==0){
                temp = n1/2-1;
                Q1 = (arr[temp/2]+arr[temp/2-1])/2; 
            }else{
                temp = n1/2+1;
                Q1 = arr[temp/2];
            }
            temp = n1/2;
            Q2 = (arr[temp]+arr[temp+1])/2;
            temp = n1/2+1;
                if((n1-temp)%2!=0){
                    Q3 = (arr[(temp+n1)/2]+arr[(n1+temp)/2+1])/2; 
                }else{
                    Q3 = arr[(temp+n1)/2]; 
                }
        }else{
            n1 = n1-1;
            temp = n1/2;
            Q1 = (arr[(0+temp)/2]+arr[(0+temp)/2-1])/2;
            Q2 = arr[n1/2];
            temp = n1/2+1;
            Q3 = (arr[(temp+n1)/2]+arr[(temp+n1)/2+1])/2;
        }
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
    }
}
