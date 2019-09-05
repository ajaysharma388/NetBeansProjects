package stringex;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ultimatehackers
 */

public class StringEx {
    static int Function(String s){
        char []s1 = s.toCharArray();
        for(int i = 0; i < s1.length ; i++)
        System.out.println(s1[i]+" ");
        int j=96;
        int count = 0 ;
            while(j<123){
                for(int i = 0;i< s1.length ;i++){
                    if(s1[i] == j){
                        count++;
                    }
                j++;
            }       
        }
            return count;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str = sc.nextLine();
        if(Function(str.toLowerCase()) == 26) 
            System.out.println("Yes it is pangrams / holoalphabetic sentences");
        else
            System.out.println("No it is not pangrams / holoalphabetic sentences");        
        
    }    
}
