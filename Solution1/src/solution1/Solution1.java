package solution1;
/**
 *
 * @author ultimatehackers
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic{
    int []Arr; 
    int Sum;
    int count;
    public Calculator(){
        Arr = new int[201];
        Sum = 0;
        count = 0;
    }
    public int divisorSum(int n){
        for(int i = 1 ; i <= n ; i++ ){
            if(n%i==0){
                Arr[count] = i;
                count++;
            }
        }
       // for(int i = 0 ; i < count ; i++){
         //   System.out.print(Arr[i]+"  ");
        //}
        for(int i = 0 ; i < count ; i++ ){
            if(Arr[i]<=n){
                Sum = Sum+Arr[i];
            }
        }
        System.out.println();
        return(Sum);
    }
}
public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}