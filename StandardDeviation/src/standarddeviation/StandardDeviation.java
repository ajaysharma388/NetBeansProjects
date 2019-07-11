/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standarddeviation;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StandardDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double u = 0;
        double sum = 0;
        int[] Element = new int[n];
        for(int i = 0 ; i < n ; i++){
            Element[i] = sc.nextInt();
            sum+=Element[i];
        }
        u = sum/n;
        sum = 0;
        for(int i = 0 ; i < n ; i++ ){
            sum += (Element[i]-u)*(Element[i]-u);
        }
        System.out.printf("%.1f\n",Math.sqrt(sum/n));
    } 
}
