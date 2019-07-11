/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday15;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k ,t;
        for(int i = 1 ; i < 2*num ; i++){
            k = i;
            t=1;
            if(k>num)
                k = 2*num-i;
            for(int j = 1 ; j <= num ; j++){
                if(j>=num+1-k){
                    System.out.print(t);
                    t++;
                }else
                    System.out.print(" ");
            }           
            System.out.println();
        }        
    }    
}
