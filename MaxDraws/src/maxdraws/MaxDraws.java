/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdraws;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MaxDraws {

    /*
     * Complete the maximumDraws function below.
     */
    static int maximumDraws(int n) {
        n +=1;
        return (n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = sc.nextInt();
            int result = maximumDraws(n);
            System.out.println(result);
        }
        sc.close();
    }
}
