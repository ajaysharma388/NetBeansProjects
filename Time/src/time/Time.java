package time;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Time {
    static String timeConversion(String s) {
        char []ar = s.toCharArray();
        String S1,s1,s2,s3;
        int hr = 0, mm = 0 , ss = 0; 
        if(ar[8]==80){
            hr = (ar[0]-48)*10+ar[1]-48+12;
            if(hr==24){
                hr=12;
            }
            mm = (ar[3]-48)*10+ar[4]-48;
            ss = (ar[6]-48)*10+ar[7]-48;
            if(hr<=9){
                s1 = Integer.toString(hr);
                s1 = "0"+s1;
            }else{
                s1 = Integer.toString(hr);
            }
        }else{
            hr = (ar[0]-48)*10+ar[1]-48;
            mm = (ar[3]-48)*10+ar[4]-48;
            ss = (ar[6]-48)*10+ar[7]-48;
            if(hr==12){
                hr=0;
            }
            if(hr==0){
                s1 = Integer.toString(hr);
                s1 = "0"+s1;
            }else if(hr<=9){
                s1 = Integer.toString(hr);
                s1 = "0"+s1;
            }else{
                s1 = Integer.toString(hr);
            }
        }
        if(mm==0){
            s2 = Integer.toString(mm);
            s2 = "0"+s2;
        }else if(mm<=9){
            s2 = Integer.toString(mm);
                s2 = "0"+s2;
            }else{
                s2 = Integer.toString(mm);
            }
            if(ss==0){
                s3 = Integer.toString(ss);
                s3 = "0"+s3;
            }else if(ss<=9){
                s3 = Integer.toString(ss);
                s3 = "0"+s3;
            }else{
                s3 = Integer.toString(ss);
            }
            S1 = new String(s1+":"+s2+":"+s3);
            return(S1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result =  timeConversion(s);
        System.out.println(result);
    }
}  