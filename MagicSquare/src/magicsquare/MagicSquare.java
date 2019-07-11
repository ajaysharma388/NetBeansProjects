/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int count = 0;
        int sum = 0 , temp;
        for(int i = 0 ; i < 3 ; i++ ){
            temp = sum;
            sum = 0;
            for(int j = 0 ; j < 3 ; j++){
                sum = sum + s[i][j];
            }
            if(sum == temp){}
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] s = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = scanner.nextInt();
            }
        }
        /*for(int i = 0 ; i < 3 ; i++ ){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }*/
        int result = formingMagicSquare(s);
        scanner.close();
    }
}

