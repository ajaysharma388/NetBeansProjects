/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlinkedlist;

import java.util.Scanner;

/**
 *
 * @author iamaj
 */
public class Student {
    int Rollno;
    String Name;
    int Age;
    float Marks;
    Student s;
    public Student(){
        Rollno = 0;
        Name = "";
        Age = 0;
        Marks = 0.00f;
    }
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        this.Rollno = sc.nextInt();
        System.out.print("Enter Name : ");
        this.Name = sc.next();
        System.out.print("Enter Age : ");
        this.Age = sc.nextInt();
        System.out.print("Enter Marks : ");
        this.Marks = sc.nextFloat();
    }
    public void getData(){
        System.out.println(" RollNo : "+this.Rollno);
        System.out.println(" Name : "+this.Name);
        System.out.println(" Age : "+this.Age);
        System.out.println(" Marks : "+this.Marks);
    }
    public void setNext(Student s){
        this.s = s;
    }
}
