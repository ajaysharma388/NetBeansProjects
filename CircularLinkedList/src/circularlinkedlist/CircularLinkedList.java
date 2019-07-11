
package circularlinkedlist;

/**
 * * @author iamaj
 */
public class CircularLinkedList {

    /**
     * @param args the command line arguments
     */ 
    public static void displayList(Student last){
        if(last == null){
            System.out.println("List Is Empty");
        }else{
            Student t = last;
            do{
                t.getData();
                t = t.s;
            }while(t!=last);
        }
    }
    public static Student insertAtBegin(Student last){
        Student s = new Student();
        s.setData();
        if(last.s == null){
            last = s;
            s.setNext(s);
        }else{
            Student t = new Student();
            t.setData();
            t.setNext(s);
        }
        return last;
    }
    public static void main(String[] args) {
        Student last = new Student();
        last = insertAtBegin(last);
        last = insertAtBegin(last);
        last = insertAtBegin(last);
        displayList(last);
    }    
}
