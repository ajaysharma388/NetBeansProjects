/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramsremove;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AnagramsRemove {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int maxlen = 0,maxlenn = 0;
        for(int i = 0 ; i < a.length() ; i++){
            if(a.contains(b.substring(i, b.length()-1))){
            maxlen = a.indexOf(b.substring(i, b.length()-1));
            maxlen = b.length()-(b.length()-maxlen);
            maxlenn = a.indexOf(b.substring(0, b.length()-i));
            maxlenn = b.length()-(b.length()-maxlenn);
            }
        }
        System.out.println(maxlen+" "+maxlenn);
        if(2*maxlen>2*maxlenn)
            return maxlen*2;
        return (maxlenn*2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int res = makeAnagram(a, b);
        System.out.println(res);
        scanner.close();
    }
}

