/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minheight;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinHeight {

    static int lowestTriangle(int base, int area){
        double height;
        int h;
        height = (2.0)*area/base;
        h = (int) Math.round(height);
        if(height-h>0){
            return (h+1);
        }
        return h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}