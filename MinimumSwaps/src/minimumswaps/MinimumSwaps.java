/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumswaps;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static void minimumSwaps(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
        for(int i = 0 ; i < arr.length ; i++ ){
            hm.put(arr[i], 2);
        }
        Iterator iterator = hm.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            Integer value = hm.get(key);
            System.out.println(key + " " + value);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        minimumSwaps(arr);
        //int res = minimumSwaps(arr);
        //System.out.println(res);
        scanner.close();
    }
}