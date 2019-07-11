/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catmouse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatMouse{
    static String catAndMouse(int x, int y, int z) {
        String result="";
        if(z > x && z > y){
            while(x < z && y < z){
                x++;
                y++;
            }
            if(x == z && y == z){
                result = "Mouse C";
            }else if(y == z){
                result = "Cat B";
            }else{
                result = "Cat A";
            }
        }else if(z > x && z < y){
            while(x < z && y > z){
                x++;
                y--;
            }
            if(x == z && y == z){
                result = "Mouse C";
            }else if(y == z){
                result = "Cat B";
            }else{
                result = "Cat A";
            }
        }else if(z < x && z > y){
            while(x > z && y < z){
                x--;
                y++;
            }
            if(x == z && y == z){
                result = "Mouse C";
            }else if(y == z){
                result = "Cat B";
            }else{
                result = "Cat A";
            }
        }else{
            while(x > z && y > z){
                x--;
                y--;
            }
            if(x == z && y == z){
                result = "Mouse C";
            }else if(y == z){
                result = "Cat B";
            }else{
                result = "Cat A";
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
    scanner.close();
    }
}
