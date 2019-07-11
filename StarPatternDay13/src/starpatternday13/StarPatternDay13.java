/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternday13;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StarPatternDay13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a;
        for(int j = 1 ; j <= num ; j++){
            a=j;
            for(int i = 1 ; i <= 2*num-1 ; i++){
                if(i>=num+1-j && i<=num-1+j){
                    System.out.print(a);
                    if(i<num)
                        a++;
                    else
                        a--;
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
