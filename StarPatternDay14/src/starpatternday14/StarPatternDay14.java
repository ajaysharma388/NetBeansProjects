/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday14;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k ;
        for(int i = 1 ; i < 2*num ; i++){
            k = 2*num-i-1;
            for(int j = 1 ; j < 2*num ; j++){
                if(j<=2*num-i)
                    System.out.print(k);
                else
                    System.out.print(" ");
                k--;
            }           
            System.out.println();
        }        
    }  
}
//   j<2*num-i