package possible;
import java.io.*;
import java.util.*;

public class Possible{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        double countn = 0,countp = 0,count = 0;
        int []A  = new int[Size];
        for(int i = 0 ; i < Size ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < Size ; i++){
            if(A[i]>0)
                countp++;
            else if(A[i]<0)
                countn++;
            else
                count++;
        }
        double p = countp/Size;
        double n = countn/Size;
        double z = count/Size;
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);        
    }
}