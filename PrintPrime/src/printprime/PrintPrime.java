/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printprime;

import java.util.*;
import java.lang.*;

class PrintPrime
{
	public static void PrintPrime(int n , int n2){
        int counter ;
        if(n==1 || n==0)
            n=2;
        for(int i = n ; i <= n2 ; i++){
            counter = 0;
            for(int j = 2 ; j < n2 ; j++){
               if(i % j == 0 && i!=j){
                   counter++;
               } 
            }
            if(counter == 0){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numStart ,numEnd;
        for(int i=0;i<num;i++){
        	numStart = sc.nextInt();
        	numEnd = sc.nextInt();
        	PrintPrime(numStart , numEnd);
        }
    }
}