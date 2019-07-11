/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingbook;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {
    static int pageCount(int n, int p) {
        int count,loop;
        if(n%2==0){
            if(p ==  1 || p == n){
                return 0;
            }else{
                count = 0;
                if(n-p>=p){
                    loop = 2 ;
                    while(loop<=p){
                        loop = loop + 2 ;
                        count++;
                    }
                    return count;
                }else{
                    count = 0;
                    loop = n-1;
                    while(loop >= p){
                        loop = loop - 2 ;
                        count++;
                    }  
                return count;
                }
            }
        }else{
                if(p ==  1 || p == n-1 || p == n){
                    return 0;
                }else{
                    count = 0;
                    loop = 2 ;
                    if(n-p>=p){                        
                        while(loop<=p){
                            loop = loop + 2 ;
                            count++;
                        }
                        return count;
                    }else{
                        count = 0;
                        loop = n;
                        while(loop > p){
                            loop = loop - 2 ;
                            count++;
                        }  
                        return count;
                    }
                }                
            }
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int result = pageCount(n, p);
        System.out.println(result);
        scanner.close();
    }
}
