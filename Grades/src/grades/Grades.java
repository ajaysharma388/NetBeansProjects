package grades;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Grades{
    static int[] solve(int[] grades){
        int[] rs = new int[grades.length];
        for(int i = 0 ; i < grades.length ; i++ ){
            if(grades[i] >= 38){
                int ques = grades[i]/5;
                ques++;
                if((ques*5)-grades[i]<3){
                    rs[i] = (ques)*5;
                }else{
                    rs[i] = grades[i];
                }
            }else{
                rs[i] = grades[i];
            }
        }
        return(rs);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int i=0; i < n; i++){
            grades[i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");  
    }
}
