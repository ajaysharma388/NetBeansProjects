package printascii;
import java.util.*;
public class PrintAscii{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Character :");
        char c = sc.next().charAt(0);
        System.out.println("The Ascii Code Of "+c+" is :"+(int)c);
    }
}