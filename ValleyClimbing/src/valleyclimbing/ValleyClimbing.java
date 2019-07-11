/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valleyclimbing;

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

public class ValleyClimbing {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count = 0, Level = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='U'){
                Level++;
                if(Level==0){
                    count++;
                }
            }else{
                Level--;
            }
        }       
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();
        int result = countingValleys(s.length(), s);
        System.out.println(result);
        scanner.close();
    }
}
