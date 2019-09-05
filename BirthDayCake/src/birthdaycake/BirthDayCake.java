package birthdaycake;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthDayCake{

    static int solve(int n, int[] s, int d, int m){
        int count = 0;
        if(n < 3){           
                if( n == 1){
                   if(s[0]==d)
                     count++;
                }else{
                    if(n==2){
                        if(s[0]+s[1]==d){
                            count++;
                        }
                    }
                }
            return count;
        }else{
        for(int i = 1 ; i < n-2 ; i ++ ){
                if(s[i]==m){
                    if(s[i]+s[i+1]==d ){
                            count++;
                    }
                    if(s[i]+s[i-1]==d){
                        count++;
                    }
                }
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
