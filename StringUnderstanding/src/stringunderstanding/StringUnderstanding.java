/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringunderstanding;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.util.*;

public class StringUnderstanding {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(A+" "+B);
    }
}

