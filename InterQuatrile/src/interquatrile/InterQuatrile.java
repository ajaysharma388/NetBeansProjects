/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interquatrile;
import java.util.Scanner;
/**
 *
 * @author iamaj
 */
public class InterQuatrile {

    /**
     * @param args the command line arguments
     */
    public static void sortArray(int []arr){
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int sum = 0,count = 0,var = 0;
        double Q1 = 0,Q2 = 0;
        int[] Element = new int[n];
        int[] Frequency = new int[n];
        for(int i = 0 ; i < n ; i++){
            Element[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            Frequency[i] = sc.nextInt();
            sum = sum + Frequency[i];
        }
        int[] ResultSet = new int[sum];
        for(int i = 0 ; i < n ; i++ ){
            count = Frequency[i];
            while(var < sum && count > 0){
                ResultSet[var] = Element[i];
                var++;
                count--;
            }
        }    
        sortArray(ResultSet);
        if((sum-1)%2!=0){
            var = sum/2;
            Q1 = (ResultSet[(var-1)/2]+ResultSet[(var-1)/2+1])/2.0;
            Q2 = (ResultSet[((var+1)+(sum-1))/2]+ResultSet[((var+1)+(sum-1))/2+1])/2.0;
        }else{
            var = sum/2-1;
            Q1 = ResultSet[var/2];
            var = sum/2+1;
            Q2 = ResultSet[(var+sum)/2];            
        }
        System.out.printf("%.1f\n",Q2-Q1);
    }
}
