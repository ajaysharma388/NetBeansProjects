/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count,i,j;
        /* Enter your code here. Print output to STDOUT. */
        if(A.length()%2!=0){
            count = 0;
            for(j = 0 ; j < A.length()/2 ; j++){
                if(A.charAt(j) == A.charAt(A.length()-j-1)){
                    count++;
                }
            }
            if(count == (A.length()-1)/2){
                System.out.println("Yes");
            }
        }else{
	    count = 0;
            for(i = 0 ; i < A.length()/2 ; i++){
                if(A.charAt(i) == A.charAt(A.length()-i-1)){
                    count++;
                }
            }
            if(count == A.length()/2){
                System.out.println("Yes");
            }
	}
    }    
}
