package shiftarray;
import java.util.*;
public class ShiftArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter The Size Of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Number Of Pass : ");
        int d = sc.nextInt();
        int temp = 0, pass = 0;
        int []A = new int[n];
        System.out.println("Enter The Array Of "+n+" Element's");
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        do{
            temp = A[n-1];
            for(int i = n-1;i > 0; i--){
                A[i] = A[i-1];
            }
            A[0] = temp;
            pass++;
        }while(d>pass);
        for(int i = 0 ; i < n ; i++)
            System.out.print(A[i]+"   ");
        System.out.println();
    } 
}
