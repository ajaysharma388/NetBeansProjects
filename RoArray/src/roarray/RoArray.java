package roarray;
import java.util.*;
/**
 *
 * @author ultimatehackers
 */
public class RoArray {
    public static int find(int []arr,int n){
        int beg = 0;
        int last = arr.length;
        int mid =0;
        while(beg<last){
        mid = (beg + last)/2;
        if(arr[mid]>=n && arr[beg]<=n){
            beg = 0;
            last = mid;
        }else{
            beg = mid+1;
        }
        }
        return(mid);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []A = new int[size];
        for(int i = 0 ; i < A.length ; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter The Element to search : ");
        int num = sc.nextInt();
        int index = find(A,num);
        System.out.println(index);
    } 
}
