/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicchip;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicChip {
    static int getMoneySpent(int[] keyboards, int[] drives, int b){
        int temp = 0;
        //int[] res = new int[keyboards.length*drives.length];
        for (int i = 0; i < keyboards.length ; i++){
            for (int j = i + 1; j < keyboards.length ; j++){
                if (keyboards[i] > keyboards[j]){
                    temp = keyboards[i];
                    keyboards[i] = keyboards[j];
                    keyboards[j] = temp;
                }
            }
        }
        temp = 0;
        for (int i = 0; i < drives.length ; i++){
            for (int j = i + 1; j < drives.length ; j++){
                if (drives[i] < drives[j]){
                    temp = drives[i];
                    drives[i] = drives[j];
                    drives[j] = temp;
                }
            }
        }
        temp = 0;
        for (int i = 0; i < keyboards.length ; i++){
            for (int j = 0; j < drives.length ; j++){
                if (keyboards[i]+drives[j] < b && keyboards[i]+drives[j] > temp ){
                    temp = keyboards[i] + drives[j];
                }
            }
        }
        if(temp == 0)
            return -1;
        return temp;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] keyboards = new int[n];
        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            keyboards[keyboardsItr] = scanner.nextInt();
        }
        int[] drives = new int[m];
        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
             drives[drivesItr] = scanner.nextInt();
        }
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
        scanner.close();
    }
}