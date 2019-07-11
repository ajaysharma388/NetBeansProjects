/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class Anagrams {

    /**
     * @param args the command line arguments
     */
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length())
            return false;
        Map<Character ,Integer> S1 = new HashMap<Character ,Integer>();
        Map<Character ,Integer> S2 = new HashMap<Character ,Integer>();
        int count;
        for(int i = 0 ; i < a.length() ; i++){
            count = 0;
            if(!S1.containsKey(a.charAt(i)))
                S1.put(a.charAt(i),1);
            else
                S1.put(a.charAt(i),S1.get(a.charAt(i))+1);             
        }
        for(int i = 0 ; i < b.length() ; i++){
            count = 0;
            if(!S2.containsKey(b.charAt(i)))
                S2.put(b.charAt(i),1);
            else
                S2.put(b.charAt(i),S2.get(b.charAt(i))+1);             
        }
        count = 0;
        Iterator it = S2.entrySet().iterator();
        for (Map.Entry<Character, Integer> entry : S1.entrySet()){
            Map.Entry pair = (Map.Entry)it.next();
	    if(pair.getKey() == entry.getKey() && pair.getValue() == entry.getValue())
                count++;
            else
                return false;
        }
        if(count==S1.size())
            return true;
        return false;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        //isAnagram(a,b);
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}