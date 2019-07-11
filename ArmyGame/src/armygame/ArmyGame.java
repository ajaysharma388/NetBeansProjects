/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armygame;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArmyGame {
    /*
     * Complete the gameWithCells function below.
     */
    static int gameWithCells(int n, int m) {
        int num = n*m;
        System.out.println(num);
        int temp;
        if(num%4 != 0){
            temp = num/4;
            System.out.println(temp);
            num = num/4+1;
        }else{
            num = num/4;
        }
        return(num);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = gameWithCells(n, m);
        System.out.println(result);
    }
}
