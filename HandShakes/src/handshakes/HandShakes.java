/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handshakes;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class HandShakes {

    /**
     * @param args the command line arguments
     */
    static int handshake(int n) {
        int handShakes = 0;
        if(n == 1){
            return 0;
        }
        handShakes = (n-1) + handshake(n-1);
        return (handShakes);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = sc.nextInt();
            int result = handshake(n);
            System.out.println(result);
        }
    }
    
}
