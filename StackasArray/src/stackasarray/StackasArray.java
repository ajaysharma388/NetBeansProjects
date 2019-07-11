/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackasarray;
import java.util.Scanner;
/**
 *
 * @author iamaj
 */
public class StackasArray {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int top;
    public static int[] insertItem(int []stack,int top){
        int []ar = new int[stack.length+1];
        for(int i =0 ; i < stack.length ; i++){
            ar[i] = stack[i];
        }
        System.out.print("Enter The Data You Want to insert : ");
        ar[ar.length-1] = sc.nextInt();
        top++;
        return ar;
    }
    public static void DisplayItem(int []stack){
        for(int i = stack.length-1 ; i >= 0 ; i--){
            System.out.println("|"+stack[i]+"|");
        }
    }
    public static int[] DeleteItem(int item , int []stack , int top){
        int pos = LocateItem(top , stack , item);
        int  []rs = new int[stack.length-1];
        if(pos < 0 ){
            System.out.println("The Element Is Not In The Stack!");
        }else{
            if(pos == stack.length-1){
                top--;
                for(int i = 0 ; i < rs.length ; i++){
                    rs[i] = stack[i];
                }
            }else{
                top--;
                for(int i = 0 ; i < pos ; i++){
                    rs[i] = stack[i];
                }
                for(int i = pos ; i < rs.length ; i++){
                    rs[i] = stack[i+1];
                }
            }
        }
        return rs;
    }
    public static int LocateItem(int top , int []stack , int item){
        int pos = -1;
        for(int i = 0 ; i < stack.length ; i++){
            if(item == stack[i])
                pos = i;
        }
        return pos;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter The Length of stack : ");
        int num = sc.nextInt();
        int item;
        top = 0;
        int []stack = new int[0];
        for(int i = 0 ; i < num ; i++){
            stack = insertItem(stack,top);
        }
        DisplayItem(stack);
        stack = insertItem(stack,top);
        stack = insertItem(stack,top);
        DisplayItem(stack);
        System.out.print("Enter Which Element You want Delete : ");
        item = sc.nextInt();
        stack = DeleteItem(item , stack , top);
        DisplayItem(stack);
        System.out.print("Enter Which Element You want Delete : ");
        item = sc.nextInt();
        stack = DeleteItem(item , stack , top);
        DisplayItem(stack);
        System.out.print("Enter Which Element You want Delete : ");
        item = sc.nextInt();
        stack = DeleteItem(item , stack , top);
        DisplayItem(stack);
        System.out.print("Enter Which Element You want Delete : ");
        item = sc.nextInt();
        stack = DeleteItem(item , stack , top);
        DisplayItem(stack);
    }
}
