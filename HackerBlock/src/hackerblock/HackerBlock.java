/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerblock;
import java.util.Scanner;
/**
 *
 * @author iamaj
 */
public class HackerBlock {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void fun(int []ar ,int l){
        for(int j = 0 ; j < ar.length ; j++)
            ar[j] = sc.nextInt();
        int sum = 0;
        int q = sc.nextInt();
        int u = sc.nextInt();
        int r1[] = new int[q];
        int r2[] = new int[q];
        int in[] = new int[u];
        int up[] = new int[u];
        for(int i = 0 ; i < q ; i++){
            r1[i] = sc.nextInt();
            r2[i] = sc.nextInt();
        }
        for(int i = 0 ; i < q ; i++){
            in[i] = sc.nextInt();
            up[i] = sc.nextInt();
        }
        System.out.println("#Test_Case : "+l);
        for(int k = 0 ; k < q ; k++){
        for(int i = r1[k]-1 ; i < r2[k] ; i++)
            sum = sum + ar[i];
        System.out.println("Sum of values in given range = "+sum); 
        sum = 0;
        }       
        for(int k = 0 ; k < q ; k++){
            ar[in[k]-1] = up[k];
            for(int i = r1[k]-1 ; i < r2[k] ; i++)
                sum = sum + ar[i];
            System.out.println("Updated sum of values in given range ="+sum); 
            sum = 0;
        }     
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num = sc.nextInt();
        int []ar;
        int size;
        for(int i = 1 ; i <= num ; i++){
            size = sc.nextInt();
            ar = new int[size];
            fun(ar,i);
        }
    }
}
