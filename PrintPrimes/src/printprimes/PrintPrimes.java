/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printprimes;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class PrintPrimes {

    /**
     * @param args the command line arguments
     */
    public static void PrintPrime(int n){
        int counter ;
        for(int i = 2 ; i <= n ; i++){
            counter = 0;
            for(int j = 2 ; j < n ; j++){
               if(i % j == 0 && i!=j){
                   counter++;
               } 
            }
            if(counter == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintPrime(num);
    }
    
}
