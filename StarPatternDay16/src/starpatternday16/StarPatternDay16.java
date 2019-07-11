/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday16;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i < 2*num ; i++){
            for(int j = 1 ; j <= num ; j++){
                if(){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }           
            System.out.println();
        }        
    }
}
