/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringregx;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.util.*;

public class StringRegx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String []ar = s.split("[^a-zA-z]");//\\,+|
        System.out.println(ar.length);
        for(int i = 0 ; i < ar.length ; i++)
            System.out.println(ar[i]);
        scan.close();
    }
}
