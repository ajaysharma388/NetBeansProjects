package javaapplication25;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaApplication25 {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        while(x1+v1!=x2+v2){
            x1=x1+v1;
            x2=x2+v2;
            if(x1>10000||x2>10000){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
