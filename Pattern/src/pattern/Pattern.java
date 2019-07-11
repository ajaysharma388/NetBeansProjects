/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void PrintPattern(int num){
        int counter,count;
        for(int i = 1 ; i <= num ; i++){
            counter = 1;
            for(int j = 1 ; j < 2*num ; j++){
                count = j-i;
                if(j%2!=0 && i>=counter){
                    System.out.print(i);
                    counter++;
                }else if(j%2 == 0 && count<counter-1){
                    System.out.print("*");
                    count++;
                }
            }
            System.out.println();   
        }
        for(int i = num ; i >= 1 ; i--){
            counter = 1;
            for(int j = 1 ; j < 2*num ; j++){
                count = j-i;
                if(j%2!=0 && i>=counter){
                    System.out.print(i);
                    counter++;
                }else if(j%2 == 0 && count<counter-1){
                    System.out.print("*");
                    count++;
                }
            }
            System.out.println();   
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintPattern(num);
    }
    
}
