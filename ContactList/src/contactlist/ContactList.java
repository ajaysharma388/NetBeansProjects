package contactlist;
/**
 *
 * @author ultimatehackers
 */
import java.util.*;
import java.io.*;
class ContactList{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String , Integer> contactList = new HashMap<String , Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contactList.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(contactList.get(s)!=null){
                System.out.println(s+"="+contactList.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

