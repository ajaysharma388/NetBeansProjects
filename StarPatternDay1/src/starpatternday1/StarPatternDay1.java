/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday1;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ; i < num ; i++){
            for(int j = num-i-1 ; j < num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
