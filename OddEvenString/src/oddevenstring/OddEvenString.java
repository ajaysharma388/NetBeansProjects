package oddevenstring;
import java.io.*;
import java.util.*;

public class OddEvenString {
    static public void fun(String S){
        char []arr = S.toCharArray();
        String Odd = "",Even = "";
        for(int i = 0 ; i < arr.length ; i++){
             if(i%2==0){
                 Even = Even+arr[i];
             }else{
                 Odd = Odd+arr[i];
             }
        }   
        System.out.println(Even+" "+Odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i < s.length ; i++){
            s[i] = sc.next();    
        }
        for(int i = 0 ; i < n ; i++){
           fun(s[i]);
        }
    }
}