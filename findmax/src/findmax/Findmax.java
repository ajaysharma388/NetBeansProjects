/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmax;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class Findmax {

    /**
     * @param args the command line arguments
     */
    public static int fndmax(int []a){
        int max;
        max = a[0];
        for(int i = 0 ; i < a.length ; i++)
            if(max < a[i])
                max = a[i];
        return max;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = fndmax(arr);
        System.out.println(res);
        sc.close();
    }
}
