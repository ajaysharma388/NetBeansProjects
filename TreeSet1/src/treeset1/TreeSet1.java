package treeset1;
import java.util.*;
class Book{
    String Title;
    String Auther;
    double Price;
    public Book(String Title,String Auther,double Price){
        this.Title = Title;
        this.Auther = Auther;
        this.Price = Price;
    }
    public String getTitle(){
        return(Title);
    }
    public String getAuther(){
        return(Auther);
    }
    public double getPrice(){
        return(Price);
    }
}
class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Book book1 = (Book)o1;
        Book book2 = (Book)o2;
        if(book1.getPrice() > book2.getPrice()){
            return(-1);
        }else{
            return(1);
        }
    }
}
public class TreeSet1{
    public static void main(String[] args) {
        Book b1,b2,b3;
        b1 = new Book("JAVA","Ajay",546.89);
        b2 = new Book("PHP","Vijay",435.67);
        b3 = new Book("CPP","DEEPAK",342.78);
        TreeSet t = new TreeSet(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Book b;
        Iterator it = t.iterator();
        while(it.hasNext()){
            b = (Book)it.next();
            System.out.println(b.getTitle()+"  "+b.getAuther()+"  "+b.getPrice());
        }
    } 
}
