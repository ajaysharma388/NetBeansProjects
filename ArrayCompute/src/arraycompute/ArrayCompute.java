package arraycompute;
import java.util.*;
/**
 *
 * @author ultimatehackers
 */
public class ArrayCompute {
    int []ArrayB;
    int []ArrayA;
    Scanner sc = new Scanner(System.in);
    public void getArray(){
        System.out.print("Enter The Size For First Array : ");
        int sizeA = sc.nextInt();
        ArrayA= new int[sizeA];
        System.out.println("Enter The First Array.");
        for(int i = 0 ; i < sizeA ; i++){
            ArrayA[i] = sc.nextInt();
        }
        System.out.print("Enter The Size For Second Array : ");
        int sizeB = sc.nextInt();
        ArrayB = new int[sizeB];
        System.out.println("Enter The Second Array.");
        for(int i = 0 ; i < sizeB; i++){
            ArrayB[i] = sc.nextInt();
        }
    }
    public void sortArray(){
        int temp;
        for(int j = 0 ; j < ArrayA.length ; j++)
        for(int i = 0 ; i < ArrayA.length-1 ;i++){
            if(ArrayA[i] > ArrayA[i+1]){
                temp = ArrayA[i];
                ArrayA[i] = ArrayA[i+1];
                ArrayA[i+1] = temp;
            }
        }     
        for(int j = 0 ; j < ArrayB.length ; j++)
        for(int i = 0 ; i < ArrayB.length-1 ;i++){
            if(ArrayB[i] > ArrayB[i+1]){
                temp = ArrayB[i];
                ArrayB[i] = ArrayB[i+1];
                ArrayB[i+1] = temp;
            }
        }     
        
    }
    public void displayArray(){
        System.out.println("First Array.");
        for(int i = 0 ; i < ArrayA.length ; i++){
            System.out.print(ArrayA[i]+"  ");
        }
        System.out.println("\nSecond Array.");
        for(int i = 0 ; i < ArrayB.length ; i++){
            System.out.print(ArrayB[i]+"  ");
        }
        System.out.println("");
    }
    public void compareArray(){
        int count = 0;
        for(int i = 0 ; i < ArrayA.length ; i++){
            for(int j = 0 ; j < ArrayB.length ; j++){
                if(ArrayA[i] == ArrayB[j]){
                    count++;
                }
            }                    
        }  
        System.out.println("Common Element's Are "+count);
    }
    public static void main(String []args){
        ArrayCompute Obj = new ArrayCompute();
        Obj.getArray();
        Obj.sortArray();
        Obj.compareArray();
    }
}
