package dictionarypractice;
import java.util.*;
import java.io.*;
class DictionaryPractice{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String , Integer> contactList = new HashMap<String , Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contactList.put(name,phone);
        }
        /*while(in.hasNext()){
            String s = in.next();
            if()
        }*/
        contactList.get("Ajay");
        contactList.get("Vijay");
        contactList.get("Deepak");
        in.close();
    }
}
