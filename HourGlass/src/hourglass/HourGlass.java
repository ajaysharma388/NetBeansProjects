package hourglass;
/**
 *
 * @author ultimatehackers
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HourGlass {
    static int []sum = new int[16];
    static int s ;
    static public int CalMaxx(){
        int max = sum[0];
        for(int i = 1 ; i < 16 ; i++ ){
            if(max<=sum[i]){
                max=sum[i];
            }
        }
        return(max);
    }
    static public void assign(int n , int a){
        sum[s]=n;
        s++;
    }
    public static void HgSum(int [][]A , int x ,int y){
        int temp = A[x][y]+A[x][y+1]+A[x][y+2]+A[x+1][y+1]+A[x+2][y]+A[x+2][y+1]+A[x+2][y+2]; 
        assign(temp,s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int k = 0 ; k < 6 ; k++)
            for(int j  = 0 ; j < 6 ; j++ ){
                if(k<=3 && j<=3){
                    HgSum(arr,k,j);
                }
            }
        System.out.println(CalMaxx());
    }
}
