package arr;
import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int []A = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        int mid,beg=0,pos=0,last=n-1;
        while(beg<=last){
            mid=(beg+last)/2;
            if(A[mid]==item){
              pos = mid;
              break;
            }
            else if(A[mid]> item ){
              last=mid--;
            }else{
              beg=mid++;
            }
        }
        if(pos>=0)
        System.out.println(pos);
        else
        System.out.println(-1);
    }
}
