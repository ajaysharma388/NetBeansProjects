package shiftleft;
import java.util.*;
public class ShiftLeft {
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
            temp = A[0];
            for(int i = 0 ; i < n-1 ; i++){
                A[i] = A[i+1];
            }
            A[n-1] = temp;
            pass++;
        }while(d>pass);
        for(int i = 0 ; i < n ; i++)
            System.out.print(A[i]+"   ");
        System.out.println();
    }
}
