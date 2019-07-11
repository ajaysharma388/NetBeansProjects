/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetofind;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author iamaj
 */
public class CodeToFind {
static int[] oddNumbers(int l, int r) {
        int length = (r-l)/2+1;
        int []result = new int[length];
        int k = 0;
        for(int i = l; i<=r ; i++)
            if(i%2!=0 && k<length){
                result[k] = i;
                k++;
            }
        return result;
    }
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int[] res = oddNumbers(l, r);
        for (int resItr = 0; resItr < res.length; resItr++)
            if(res[resItr]!=0)
                System.out.print(res[resItr]+" ");   
        System.out.println();
        scanner.close();
    }
}
