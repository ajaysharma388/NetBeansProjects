package binarynumber;
import java.util.*;
/**
 *
 * @author ultimatehackers
 */
public class BinaryNumber {
    static int []A=new int[20];
    static int count;
    static public void trace(int index){
        if(index > 1)
            if(A[index-1]==1 && index < A.length-2){
                count++;
            }
            else{
                count++;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ques = 0;
        int num = sc.nextInt();
        int j=0;
        for(int z = 0 ; z < A.length ;z++){
            System.out.print(A[z]);
        }
        System.out.println();
        while(num!=0){            
            A[j] = num % 2;
            ques = num / 2;
            num = ques;            
            j++;
        }
        for(int z = 0 ; z < A.length ;z++){
            System.out.print(A[z]);
        }
        for(int i = 0 ; i < A.length-1 ; i++){
            if(A[i]==1)
                trace(i);
            }
        System.out.println();
        System.out.println(count);
    }
}
