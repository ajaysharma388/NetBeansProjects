package student;
import java.util.*;
class Student1 {
    String Name;
    int Age;
    int RollNo;
    public Student1(String Name,int Age,int RollNo){
        this.Name = Name;
        this.Age = Age;
        this.RollNo = RollNo;
    }
    public String getName(){
        return(Name);
    }
    public int getRollNo(){
        return(RollNo);
    }
    public int getAge(){
        return(Age);
    }
}
class MyComp implements Comparator{
    public int compare(Object o1,Object o2){
        Student1 s1 = (Student1) o1;
        Student1 s2 = (Student1) o2;
        if(s1.getRollNo() > s2.getRollNo()){
            return(1);
        }else{
            return(-1);
        }
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet t = new TreeSet(new MyComp());
        System.out.print("Enter The Size Of Record : ");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++){
            Student1 s;
            int roll,Age;
            String Name;
            System.out.print("Enter Age : ");
            Age = sc.nextInt();
            System.out.print("Enter The Name : ");
            Name = sc.next();
            //Name = sc.nextLine();
            System.out.print("Enter RollNo : ");
            roll = sc.nextInt();
            s = new Student1(Name,Age,roll);
            t.add(s);
        }
        Student1 s;
        Iterator It = t.iterator();
        System.out.println("----------------------------");
        System.out.println("|   RollNo   | Name | Age |");
        System.out.println("----------------------------");
        while(It.hasNext()){
            s = (Student1)It.next();
            System.out.println("|"+s.getRollNo()+"  | "+s.getName()+" | "+s.getAge()+"  |");
        }
        System.out.println("----------------------------");
    }
}
