/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday11;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= 2*num-1 ; j++){
		if(j>=num+1-i && j<=num-1+i )
			System.out.print("*");
		else
			System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = num+1 ; i <= 2*num-1 ; i++){
            for(int j = 1 ; j <= 2*num-1 ; j++){
		if(j>i-num && j<2*num+num-i )
			System.out.print("*");
		else
			System.out.print(" ");
            }
            System.out.println();
        }
    }
}
