package datastructure;
import java.io.*;
import java.util.*;
/**
 *
 * @author ultimatehackers
 */
public class DataStructure {
    Deque<Character> stack;
    LinkedList queue;
    void DataStructure(){
        stack = new ArrayDeque<>();
        queue = new LinkedList();
    }
    public void pushCharacter(char ch){
           stack.push(ch);
           
    }
    public void enqueueCharacter(char ch){
        if(!queue.isEmpty()){
            queue.addFirst(ch);
        }else{
            queue.addLast(ch);
        }
    }
    public char popCharacter(){
        return((char)stack.pop());
    }
    public char dequeueCharacter(){
        return((char)queue.remove(0));
    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        char[] s = input.toCharArray();
        DataStructure p = new DataStructure();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}