/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmm;

/**
 *
 * @author iamaj
 */
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class Mmm {
    
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
        HashMap<Integer , Integer > hm = new HashMap<Integer , Integer >();
        Scanner sc = new Scanner(System.in);
        int temp , mode = 0;
        double mean = 0, median ; 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        if(n%2==0){
            median = (arr[n/2]+arr[n/2-1])/2.0;
        }else{
            median = arr[n/2-1];
        }
        for(int i = 0 ; i < n ; i++ ){
            temp = 0;
            mean = mean + arr[i];
            if(hm.containsKey(arr[i])){
                temp = hm.get(arr[i]);
                temp++;
                hm.put(arr[i],temp);
            }else{
                hm.put(arr[i],1);
            }
        }
        Iterator iterator = hm.keySet().iterator();
        mode = (Integer) hm.keySet().toArray()[0];
        temp = hm.get(mode);
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            Integer value = hm.get(key);
            if( value >= temp ){
                temp = value;
            }
        }
        Iterator it = hm.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            Integer value = hm.get(key);
            if( value == temp && mode > key){
                mode = key;
            }
        }
        //System.out.printf("%.1f\n",mean/n);
        //System.out.printf("%.1f\n",median);
        //System.out.println(mode);    
    }
}