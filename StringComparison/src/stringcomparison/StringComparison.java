/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String []result = new String[s.length()-k+1];
        for(int i = 0 ; i < s.length()-k+1 ; i++){
            result[i] = s.substring(i, i+k);
        }
        smallest = result[0];
        largest = result[0];
        for(int i = 0 ; i < s.length()-k+1 ; i++){
            System.out.println(i+1+" "+result[i]);
        }
        for(int i = 0 ; i < s.length()-k+1 ; i++){
            if(largest.compareTo(result[i])<0)
                largest = result[i];
            if(smallest.compareTo(result[i])>0)
                smallest = result[i];
        }
        return smallest + "\n" + largest;
    }
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    
    }
}
